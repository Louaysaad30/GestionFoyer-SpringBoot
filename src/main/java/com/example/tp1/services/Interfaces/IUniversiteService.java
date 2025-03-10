package com.example.tp1.services.Interfaces;

import com.example.tp1.entity.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversities();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (long idUniversite);
    Universite getUniversiteByCapacityBlocEtCapacityFoyer(Long blocs_capacity, Long foyer_capacity);
    Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite) ;
    Universite desaffecterFoyerAUniversite ( String nomUniversite) ;
}
