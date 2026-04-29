package com.nadia.entreprises.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nadia.entreprises.entities.Secteur;

@RepositoryRestResource(path = "sec")
@CrossOrigin("http://localhost:4200/")
public interface SecteurRepository extends JpaRepository<Secteur, Long> {

}
