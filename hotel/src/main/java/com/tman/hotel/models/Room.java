package com.tman.hotel.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Room {
    @Id
    private String roomId;
    private String roomNumber;
    private String occupant;
}
