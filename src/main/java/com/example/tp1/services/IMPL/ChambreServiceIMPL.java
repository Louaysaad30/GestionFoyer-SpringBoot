package com.example.tp1.services.IMPL;

import com.example.tp1.entity.Bloc;
import com.example.tp1.entity.Chambre;
import com.example.tp1.entity.TypeChambre;
import com.example.tp1.repository.BlocRepository;
import com.example.tp1.repository.ChambreRepository;
import com.example.tp1.services.Interfaces.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreServiceIMPL implements IChambreService {

    private final BlocRepository blocRepository;
    ChambreRepository chambreRepository;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public List<Chambre> getChambreByAdresseBloc(String adresse) {
        return chambreRepository.findByBlocFoyerUniversiteAdresse(adresse);
    }

    @Override
    public Chambre getChambreByCinAndNomBloc(Long cin, String nomBloc) {
        return chambreRepository.findByReservationsEtudiantsCinAndBlocNomBloc(cin, nomBloc);
    }

    @Override
    public void removeChambre(long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {
        List<Chambre> chambres = chambreRepository.findByNumeroChambreIn(numChambre);
        Bloc bloc = blocRepository.findById(idBloc).orElse(null);
        for (Chambre c : chambres) {
            c.setBloc(bloc);
            chambreRepository.save(c);
        }
        return bloc;
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) {
        return chambreRepository.findByBlocIdBlocAndTypeC(idBloc, typeC);
    }
}
