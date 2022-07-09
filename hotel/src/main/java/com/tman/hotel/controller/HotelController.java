package com.tman.hotel.controller;

import com.tman.hotel.models.Hotel;
import com.tman.hotel.models.Room;
import com.tman.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/hotel")
public class HotelController {
    @Autowired
    HotelService hotelService;

    @PostMapping("/createHotel")
    public void createHotel(@RequestBody Hotel hotel) {
        hotelService.addHotel(hotel);
    }

    @PostMapping("/addCustomer/{hotelNumber}")
    public void addCustomerInfo(@RequestBody Room room,
                                @PathVariable String hotelNumber) {
        hotelService.bookRoom(hotelNumber,room);
    }
    @GetMapping("/getHotel/{hotelId}")
    public Hotel getHotel(@PathVariable String hotelId){
        return hotelService.getHotel(hotelId);
    }

}
