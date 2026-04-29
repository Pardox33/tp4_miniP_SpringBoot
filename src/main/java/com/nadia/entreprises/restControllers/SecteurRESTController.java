package com.nadia.entreprises.restControllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nadia.entreprises.repos.SecteurRepository;
import com.nadia.entreprises.entities.Secteur;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/secteurs")
public class SecteurRESTController {
    @Autowired
    SecteurRepository secteurRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Secteur> getAllSecteurs() {
        return secteurRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Secteur getSecteurById(@PathVariable("id") Long id) {
        return secteurRepository.findById(id).get();
    }

}
