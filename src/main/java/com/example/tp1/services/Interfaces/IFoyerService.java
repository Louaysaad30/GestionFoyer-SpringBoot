package com.example.tp1.services.Interfaces;

import com.example.tp1.entity.Foyer;
import com.example.tp1.entity.TypeChambre;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer (Foyer f);
    Foyer updateFoyer (Foyer f);
    Foyer retrieveFoyer (long idFoyer);
    void removeFoyer (long idFoyer);
    Foyer getfoyerByTypeChambreEtNomBloc(TypeChambre type, String nom);
    Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, long idUniversite) ;

}
