package com.example.tp1.services.IMPL;

import com.example.tp1.entity.Bloc;
import com.example.tp1.repository.BlocRepository;
import com.example.tp1.services.Interfaces.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocServiceIMPL implements IBlocService {

    BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public List<Bloc> getBlockByNomUniversite(String nom) {
        return blocRepository.findByFoyerUniversiteNomUniversiteLike(nom);
    }


}
