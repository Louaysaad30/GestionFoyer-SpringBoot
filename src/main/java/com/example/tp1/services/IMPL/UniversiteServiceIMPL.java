package com.example.tp1.services.IMPL;

import com.example.tp1.entity.Universite;
import com.example.tp1.repository.UniversiteRepository;
import com.example.tp1.services.Interfaces.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UniversiteServiceIMPL implements IUniversiteService {
    UniversiteRepository universiteRepository;
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
}
