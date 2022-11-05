package com.kiebot.hotelbooking.service;

import com.kiebot.hotelbooking.entity.Reservation;
import org.springframework.stereotype.Service;

@Service
public interface BookingService {
    public Reservation reserveHotel(Reservation reservation);
}
