package com.example.tp1.repository;

import com.example.tp1.entity.Chambre;
import com.example.tp1.entity.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository    <Chambre, Long> {


    List<Chambre> findByBlocFoyerUniversiteAdresse(String adresse);
    Chambre findByReservationsEtudiantsCinAndBlocNomBloc(Long cin, String nomBloc);
    List<Chambre> findByNumeroChambreIn(List<Long> numChambre);
    List<Chambre> findByBlocIdBlocAndTypeC(Long idBloc , TypeChambre typeC);
}
