package com.kiebot.hotelbooking.service;

import com.kiebot.hotelbooking.entity.Hotel;
import com.kiebot.hotelbooking.entity.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {
    public Hotel addHotel(Hotel hotel);
    public List<Hotel> searchHotel(String cityname);
    public Room addRoom(Room room);
    public List<Room>getRoom(String hotelName);
}
