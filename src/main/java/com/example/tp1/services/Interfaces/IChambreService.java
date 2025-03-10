package com.example.tp1.services.Interfaces;

import com.example.tp1.entity.Bloc;
import com.example.tp1.entity.Chambre;
import com.example.tp1.entity.TypeChambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre (Chambre c);
    Chambre retrieveChambre (long idChambre);
    List<Chambre> getChambreByAdresseBloc(String adresse);
    Chambre getChambreByCinAndNomBloc(Long cin, String nomBloc);
    void removeChambre(long idChambre);
    Bloc affecterChambresABloc(List<Long> numChambre, long idBloc);
    List<Chambre> getChambresParBlocEtType (long idBloc, TypeChambre typeC) ;

}

