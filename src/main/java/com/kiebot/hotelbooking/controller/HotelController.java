package com.kiebot.hotelbooking.controller;

import com.kiebot.hotelbooking.entity.Hotel;
import com.kiebot.hotelbooking.entity.Room;
import com.kiebot.hotelbooking.service.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    HotelServiceImpl hotelService;

    @PostMapping(value = "/add_hotel")
    public Hotel addHotel(@RequestBody Hotel hotel) {
        return hotelService.addHotel(hotel);
    }

    @GetMapping(value = "/search_hotel")
    public List<Hotel> searchHotel(@RequestParam("cityName")String cityName)
    {
        return hotelService.searchHotel(cityName);
    }

    @PostMapping(value = "/add_room")
    public Room addRoom(@RequestBody Room room)
    {
        return hotelService.addRoom(room);
    }

    @GetMapping(value = "/get_hotel_room")
    public List<Room> getHotelRoom(@RequestParam("hotelName")String hotelName)
    {
        return hotelService.getRoom(hotelName);}
}
