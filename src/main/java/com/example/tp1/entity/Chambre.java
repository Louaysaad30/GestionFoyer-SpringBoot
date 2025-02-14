package com.example.tp1.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idChambre;
     Long numeroChambre;
    @Enumerated(EnumType.STRING)
     TypeChambre typeC;

    @ManyToOne
       Bloc bloc;

    @OneToMany
    List<Reservation> reservations;
}
