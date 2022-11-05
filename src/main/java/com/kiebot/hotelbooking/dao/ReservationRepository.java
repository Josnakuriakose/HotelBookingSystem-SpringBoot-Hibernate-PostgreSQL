package com.kiebot.hotelbooking.dao;

import com.kiebot.hotelbooking.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ReservationRepository extends JpaRepository<Reservation,Integer> {

}
