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
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idFoyer;
     String nomFoyer;
     Long capaciteFoyer;

     @OneToOne(mappedBy = "foyer")
        Universite universite;

     @OneToMany(mappedBy = "foyer")
     List<Bloc> blocs;


}
