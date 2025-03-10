package com.example.tp1.services.IMPL;

import com.example.tp1.entity.Bloc;
import com.example.tp1.entity.Foyer;
import com.example.tp1.entity.TypeChambre;
import com.example.tp1.entity.Universite;
import com.example.tp1.repository.BlocRepository;
import com.example.tp1.repository.FoyerRepository;
import com.example.tp1.repository.UniversiteRepository;
import com.example.tp1.services.Interfaces.IFoyerService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerServiceIMPL implements IFoyerService {
    FoyerRepository foyerRepository;
    BlocRepository blocRepository;
    UniversiteRepository universiteRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    @Override
    public Foyer getfoyerByTypeChambreEtNomBloc(TypeChambre type, String nom) {
        return foyerRepository.findByBlocsNomBlocAndBlocsChambresTypeC(nom, type);
    }

    @Transactional
    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        foyerRepository.save(foyer); // ajout foyer+blocs sans affectation
        for (Bloc b : foyer.getBlocs()) {
            b.setFoyer(foyer);
            blocRepository.save(b);
            //affectation de bloc au foyer
        }
        //affecter foyer a universite
        Universite u = universiteRepository.findById(idUniversite).orElse(null);
        assert u != null;
        u.setFoyer(foyer);
        universiteRepository.save(u);

        return foyer;
    }

}
