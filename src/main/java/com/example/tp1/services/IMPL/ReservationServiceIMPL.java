package com.example.tp1.services.IMPL;

import com.example.tp1.entity.Reservation;
import com.example.tp1.repository.ReservationRepository;
import com.example.tp1.services.Interfaces.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ReservationServiceIMPL implements IReservationService {
    ReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }
}
