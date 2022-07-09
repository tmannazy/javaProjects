package com.nazy.diary.repository;

import com.nazy.diary.models.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EntryRepository extends MongoRepository<Entry,String> {
    List<Entry> findEntriesByBodyContainingIgnoreCase(String phrase);

    Entry findEntriesByTitle(String title);
}
