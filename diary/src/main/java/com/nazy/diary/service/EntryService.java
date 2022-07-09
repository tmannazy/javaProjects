package com.nazy.diary.service;

import com.nazy.diary.models.Entry;

import java.util.List;

public interface EntryService {
    String addEntry(Entry entry);

    Entry getEntry(String entryId);

    String deleteEntry(String entryId);

    void editEntry(String entryId, String newTitle);

    List<Entry> findAllEntries(String phrase);
}
