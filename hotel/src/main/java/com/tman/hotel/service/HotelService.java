package com.tman.hotel.service;

import com.tman.hotel.models.Hotel;
import com.tman.hotel.models.Room;

public interface HotelService {
    void addHotel(Hotel newHotel);
    void addNewCustomer(Hotel n);

    Hotel getRoomCustomerInfo(int roomNumber);

    void checkOutCustomer(int roomNumber, String customerName);

    void bookRoom(String hotelNumber, Room room);

    Hotel getHotel(String hotelId);
}
