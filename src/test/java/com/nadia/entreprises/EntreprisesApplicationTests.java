package com.nadia.entreprises;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nadia.entreprises.entities.Entreprise;
import com.nadia.entreprises.repos.EntrepriseRepository;

@SpringBootTest
class EntreprisesApplicationTests {
	@Autowired
	private EntrepriseRepository entrepriseRepository;

	@Test
	public void testFindAllEntreprise() {
		List<Entreprise> ents = entrepriseRepository.findAll();
		for (Entreprise e : ents) {
			System.out.println(e);
		}
	}
}
