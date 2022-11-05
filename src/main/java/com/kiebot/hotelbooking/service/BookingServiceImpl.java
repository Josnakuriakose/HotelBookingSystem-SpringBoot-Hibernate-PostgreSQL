package com.kiebot.hotelbooking.service;


import com.kiebot.hotelbooking.dao.ReservationRepository;
import com.kiebot.hotelbooking.entity.Hotel;
import com.kiebot.hotelbooking.entity.Reservation;
import com.kiebot.hotelbooking.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService{
    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public Reservation reserveHotel(Reservation reservation)
    {
        return reservationRepository.save(reservation);
    }


}
