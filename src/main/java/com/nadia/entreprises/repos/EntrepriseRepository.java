package com.nadia.entreprises.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nadia.entreprises.entities.Entreprise;

@RepositoryRestResource(path = "rest")
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

}