package com.example.tp1.repository;

import com.example.tp1.entity.Foyer;
import com.example.tp1.entity.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepository extends JpaRepository        <Foyer, Long> {

    Foyer findByBlocsNomBlocAndBlocsChambresTypeC(String blocs_nomBloc, TypeChambre typeC);
}
