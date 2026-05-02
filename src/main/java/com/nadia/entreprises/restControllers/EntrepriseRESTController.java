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

    @GetMapping("/auth")
    Authentication getAuth(Authentication auth) {
        return auth;
    }
}