package com.example.tp1.repository;

import com.example.tp1.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository
        <Reservation, String> {
}
