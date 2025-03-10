package com.example.tp1.controller;

import com.example.tp1.entity.Bloc;
import com.example.tp1.services.Interfaces.IBlocService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Gestion-Bloc")
@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocController {

    IBlocService blocService;

    @Operation(summary = "Récupérer tous les blocs")
    @GetMapping("/blocs")
    public List<Bloc> retrieveBlocs() {
        return blocService.retrieveBlocs();
    }
    @PutMapping("/update")
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }
    @PostMapping("/add")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }
    @GetMapping("/{idBloc}")
    public Bloc retrieveBloc(@PathVariable Long idBloc) {
        return blocService.retrieveBloc(idBloc);
    }
    @DeleteMapping("/delete/{idBloc}")
    public void removeBloc(@PathVariable long idBloc) {
        blocService.removeBloc(idBloc);
    }
    @GetMapping("/bloc/{nom}")
    public List<Bloc> getBlockByNomUniversite(@PathVariable String nom) {
        return blocService.getBlockByNomUniversite(nom);
    }
}
