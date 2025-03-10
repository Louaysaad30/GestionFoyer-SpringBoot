package com.example.tp1.controller;

import com.example.tp1.entity.Bloc;
import com.example.tp1.entity.Chambre;
import com.example.tp1.entity.TypeChambre;
import com.example.tp1.services.Interfaces.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {

     IChambreService chambreService;

    @GetMapping("/chambres")
    public List<Chambre> retrieveAllChambres() {
        return chambreService.retrieveAllChambres();
    }

    @PutMapping("/update")
    public Chambre updateChambre(@RequestBody Chambre c) {
        return chambreService.updateChambre(c);
    }

    @PostMapping("/add")
    public Chambre addChambre(@RequestBody Chambre c) {
        return chambreService.addChambre(c);
    }

    @GetMapping("/{idChambre}")
    public Chambre retrieveChambre(@PathVariable long idChambre) {
        return chambreService.retrieveChambre(idChambre);
    }

    @DeleteMapping("/delete/{idChambre}")
    public void removeChambre(@PathVariable long idChambre) {
        chambreService.removeChambre(idChambre);
    }

    @GetMapping("/chambre/{adresse}")
    public List<Chambre> getChambreByAdresseBloc(@PathVariable String adresse) {
        return chambreService.getChambreByAdresseBloc(adresse);
    }

    @GetMapping("/chambre/{cin}/{nomBloc}")
    public Chambre getChambreByCinAndNomBloc(@PathVariable Long cin, @PathVariable String nomBloc) {
        return chambreService.getChambreByCinAndNomBloc(cin, nomBloc);
    }

    @PutMapping("/affecterChambresABloc/{idBloc}")
    public Bloc affecterChambresABloc(@RequestBody List<Long> numChambre,@PathVariable long idBloc) {
        return chambreService.affecterChambresABloc(numChambre, idBloc);
    }

    @GetMapping("/chambres/{idBloc}/{typeC}")
    public List<Chambre> getChambresParBlocEtType(@PathVariable long idBloc, @PathVariable TypeChambre typeC) {
        return chambreService.getChambresParBlocEtType(idBloc, typeC);
    }
}
