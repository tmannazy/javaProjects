package com.nazy.diary.service;

import com.nazy.diary.models.Entry;
import com.nazy.diary.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntryServiceImpl implements EntryService {
    @Autowired
    EntryRepository entryRepository;

    @Override
    public String addEntry(Entry entry) {
        if (entry.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Title can not be empty");
        }
        if (entry.getBody().isEmpty()) {
            throw new IllegalArgumentException("Body can not be empty");
        }
        var entryReceived = getEntryFromDBWithTitle(entry.getTitle());
        if (entryReceived.isPresent()) {
            throw new IllegalArgumentException("Your entry with title '" + entry.getTitle() + "' already exists.");
        }
        entryRepository.save(entry);
        return "Entry created successfully";
    }

    @Override
    public Entry getEntry(String entryId) {
        return getEntryFromDB(entryId);
    }

    private Entry getEntryFromDB(String entryId) {
        Optional<Entry> optionalEntry = entryRepository.findById(entryId);
        return optionalEntry.orElseThrow(
                () -> {
                    throw new IllegalArgumentException("entry not found");
                });
    }

    private Optional<Entry> getEntryFromDBWithTitle(String entryTitle) {
        return Optional.ofNullable(entryRepository.findEntriesByTitle(entryTitle));
    }

    @Override
    public String deleteEntry(String entryTitle) {
        var entryToDelete = getEntryFromDBWithTitle(entryTitle);
        Entry deleteEntry = entryToDelete.get();
        entryRepository.delete(deleteEntry);
        return "Entry '" + entryTitle + "' deleted successfully";
    }

    @Override
    public void editEntry(String entryId, String newTitle) {
        var entry = getEntryFromDB(entryId);
        entry.setTitle(newTitle);
        entryRepository.save(entry);
    }

    @Override
    public List<Entry> findAllEntries(String phrase) {
        return entryRepository.findEntriesByBodyContainingIgnoreCase(phrase);
    }
}
