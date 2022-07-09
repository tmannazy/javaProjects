package com.nazy.diary.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Entry {
    @Id
    private String entryId;
    private String title;
    private String body;
}
