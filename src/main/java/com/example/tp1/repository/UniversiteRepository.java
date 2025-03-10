package com.example.tp1.repository;

import com.example.tp1.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepository extends JpaRepository   <Universite, Long> {

    Universite findByFoyerBlocsCapaciteBlocAndFoyerCapaciteFoyer(Long blocs_capacite, Long capaciteFoyer);
    Universite findByNomUniversite(String nomUniversite);

}
