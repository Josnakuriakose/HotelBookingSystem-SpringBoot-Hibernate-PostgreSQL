package com.kiebot.hotelbooking.controller;

import com.kiebot.hotelbooking.entity.Reservation;
import com.kiebot.hotelbooking.service.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    BookingServiceImpl bookingService;
    @PostMapping(value = "/reserve_hotel")
    public Reservation reserveHotel(@RequestBody Reservation reservation) {
        return bookingService.reserveHotel(reservation);
    }

}
