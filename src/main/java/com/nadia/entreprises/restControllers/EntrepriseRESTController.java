package com.nadia.entreprises.restControllers;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nadia.entreprises.entities.Entreprise;
import com.nadia.entreprises.service.EntrepriseService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@CrossOrigin
@AllArgsConstructor
public class EntrepriseRESTController {

    private final EntrepriseService entrepriseService;

    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<Entreprise> getAllEntreprises() {
        return entrepriseService.getAllEntreprises();
    }

    @RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
    public Entreprise getEntrepriseById(@PathVariable("id") Long id) {
        return entrepriseService.getEntreprise(id);
    }

    @RequestMapping(path = "/addent", method = RequestMethod.POST)

    public Entreprise createEntreprise(@RequestBody Entreprise entreprise) {
        return entrepriseService.saveEntreprise(entreprise);
    }

    @RequestMapping(path = "/updateent", method = RequestMethod.PUT)
    public Entreprise updateEntreprise(@RequestBody Entreprise entreprise) {
        return entrepriseService.updateEntreprise(entreprise);
    }

    @RequestMapping(value = "/delent/{id}", method = RequestMethod.DELETE)
    public void deleteEntreprise(@PathVariable("id") Long id) {
        entrepriseService.deleteEntrepriseById(id);
    }

    @RequestMapping(value = "/entByName/{nom}", method = RequestMethod.GET)
    public List<Entreprise> findByNomEnt(@PathVariable("nom") String nom) {
        return entrepriseService.findByNomEntContains(nom);
    }

    @RequestMapping(value = "/entsec/{idSec}", method = RequestMethod.GET)
    public List<Entreprise> getEntrepriseByCatId(@PathVariable("idSec") Long idSec) {
        return entrepriseService.findBySecteurIdSec(idSec);
    }

    @GetMapping("/auth")
    Authentication getAuth(Authentication auth) {
        return auth;
    }
}