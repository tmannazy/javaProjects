package com.tman.hotel.repository;

import com.tman.hotel.models.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, String> {
    Hotel findHotelByHotelId(String hotelId);
}
