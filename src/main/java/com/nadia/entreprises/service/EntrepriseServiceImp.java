package com.nadia.entreprises.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.nadia.entreprises.entities.Entreprise;

import com.nadia.entreprises.repos.EntrepriseRepository;

@Service
public class EntrepriseServiceImp implements EntrepriseService {
    @Autowired
    EntrepriseRepository entrepriseRepository;

    @Override
    public List<Entreprise> getAllEntreprises() {
        return entrepriseRepository.findAll();
    }

}
