package com.tman.hotel.service;

import com.tman.hotel.models.Hotel;
import com.tman.hotel.models.Room;
import com.tman.hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    HotelRepository hotelRepository;
    @Autowired
    RoomService roomService;

    @Override
    public void addHotel(Hotel newHotel) {
        newHotel.setHotelId("1212");
        hotelRepository.save(newHotel);
    }

    @Override
    public void addNewCustomer(Hotel n) {

    }

//    @Override
//    public void addNewCustomer(String hotelId, String roomNumber, String customer) {
//        hotelRepository.save(newHotel);
//        return "Customer successfully checked in";
//    }

    @Override
    public Hotel getRoomCustomerInfo(int roomNumber) {
//        return hotelRepository.findByRoomNumber(roomNumber);
        return null;
    }

    @Override
    public void checkOutCustomer(int roomNumber, String customerName) {

    }

    @Override
    public void bookRoom(String hotelNumber, Room room) {
        var hotel = getHotel(hotelNumber);
        var addedRoom = roomService.addRoom(room);
        hotel.getHotelRooms().add(addedRoom);
        hotelRepository.save(hotel);
    }
    public Hotel getHotel(String hotelId){
        Optional<Hotel> hotelOptional = Optional.ofNullable(hotelRepository.findHotelByHotelId(hotelId));
        return hotelOptional.orElseThrow(()->{
            throw new IllegalArgumentException("not found");
        });
    }
}
