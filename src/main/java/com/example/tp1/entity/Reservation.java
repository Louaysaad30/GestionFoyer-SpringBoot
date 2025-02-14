package com.example.tp1.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Reservation {
    @Id
     String idReservation;
     LocalDate anneeUniversitaire;
     boolean estValide;

     @ManyToMany
     List<Etudiant> etudiants;
}
