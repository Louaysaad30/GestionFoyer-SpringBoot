package com.example.tp1.controller;

import com.example.tp1.entity.Universite;
import com.example.tp1.services.Interfaces.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {

    IUniversiteService universiteService;

    @GetMapping("/universites")
    public List<Universite> retrieveAllUniversites() {
        return universiteService.retrieveAllUniversities();
    }

    @PutMapping("/update")
    public Universite updateUniversite(@RequestBody Universite u) {
        return universiteService.updateUniversite(u);
    }

    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite u) {
        return universiteService.addUniversite(u);
    }

    @GetMapping("/{idUniversite}")
    public Universite retrieveUniversite(@PathVariable long idUniversite) {
        return universiteService.retrieveUniversite(idUniversite);
    }
    @PutMapping("/affecterFoyerAUniversite/{idFoyer}/{nomUniversite}")
    public Universite affecterFoyerAUniversite(@PathVariable long idFoyer,@PathVariable String nomUniversite) {
        return universiteService.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }

    @PutMapping("/desaffecterFoyerUniversite/{nomUniversite}")
    public Universite desaffecterFoyerAUniversite(@PathVariable String nomUniversite) {
        return universiteService.desaffecterFoyerAUniversite(nomUniversite);
    }

    /*@DeleteMapping("/delete/{idUniversite}")
    public void removeUniversite(@PathVariable long idUniversite) {
        universiteService.removeUniversite(idUniversite);
    }*/
}
