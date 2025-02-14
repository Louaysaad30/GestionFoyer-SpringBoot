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
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idBloc;
     String nomBloc;
     Long capaciteBloc;

     @ManyToOne
        Foyer foyer;

     @OneToMany(mappedBy = "bloc")
     List<Chambre> chambres;
}
