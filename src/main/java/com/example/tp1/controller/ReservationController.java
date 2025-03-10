package com.example.tp1.controller;

import com.example.tp1.entity.Chambre;
import com.example.tp1.entity.Reservation;
import com.example.tp1.services.Interfaces.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {
    IReservationService reservationService;


    @GetMapping("/reservations")
    public List<Reservation> retrieveAllReservations() {
        return reservationService.retrieveAllReservation();
    }

    @PutMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation res) {
        return reservationService.updateReservation(res);
    }

    /*@PostMapping("/add")
    public Reservation addReservation(@RequestBody Reservation res) {
        return reservationService.addReservation(res);
    }*/

    @GetMapping("/{idReservation}")
    public Reservation retrieveReservation(@PathVariable String idReservation) {
        return reservationService.retrieveReservation(idReservation);
    }

    /*@DeleteMapping("/delete/{idReservation}")
    public void removeReservation(@PathVariable String idReservation) {
        reservationService.removeReservation(idReservation);
    }*/
}
