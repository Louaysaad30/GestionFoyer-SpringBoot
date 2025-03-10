package com.example.tp1.services.IMPL;

import com.example.tp1.entity.Foyer;
import com.example.tp1.entity.Universite;
import com.example.tp1.repository.FoyerRepository;
import com.example.tp1.repository.UniversiteRepository;
import com.example.tp1.services.Interfaces.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UniversiteServiceIMPL implements IUniversiteService {
    UniversiteRepository universiteRepository;
    FoyerRepository foyerRepository;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public Universite getUniversiteByCapacityBlocEtCapacityFoyer(Long blocs_capacity, Long foyer_capacity) {
        return universiteRepository.findByFoyerBlocsCapaciteBlocAndFoyerCapaciteFoyer(blocs_capacity, foyer_capacity);
    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Foyer f = foyerRepository.findById(idFoyer).orElse(null);
        Universite u = universiteRepository.findByNomUniversite(nomUniversite);
        u.setFoyer(f);
        return universiteRepository.save(u);
    }

    @Override
    public Universite desaffecterFoyerAUniversite( String nomUniversite) {
        Universite u = universiteRepository.findByNomUniversite(nomUniversite);
        u.setFoyer(null);
        return universiteRepository.save(u);
    }
}
