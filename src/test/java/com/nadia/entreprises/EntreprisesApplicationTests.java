package com.nadia.entreprises;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nadia.entreprises.entities.Entreprise;
import com.nadia.entreprises.entities.Secteur;
import com.nadia.entreprises.repos.EntrepriseRepository;

@SpringBootTest
class EntreprisesApplicationTests {
	@Autowired
	private EntrepriseRepository entrepriseRepository;

	@Test
	public void testCreateEntreprise() {
		Entreprise ent = new Entreprise("Riot", 850.0, new Date(), "riot@gmail.com");
		ent.setSecteur(null);
		entrepriseRepository.save(ent);
	}

	@Test
	public void testFindEntreprise() {
		Entreprise e = entrepriseRepository.findById(1L).get();
		System.out.println(e);
	}

	@Test
	public void testUpdateEntreprise() {
		Entreprise e = entrepriseRepository.findById(1L).get();
		e.setChiffreAff(988.0);
		entrepriseRepository.save(e);
		System.out.println(e);
	}

	@Test
	public void testDeleteEntreprise() {
		entrepriseRepository.deleteById(3L);
	}

	@Test
	public void testFindAllEntreprise() {
		List<Entreprise> ents = entrepriseRepository.findAll();
		for (Entreprise e : ents) {
			System.out.println(e);
		}
		;
	}

	@Test
	public void testFindByNomEnt() {
		List<Entreprise> ents = entrepriseRepository.findByNomEnt("Riot");
		System.out.println("RECHRCHE ENTREPRISE PAR NOM: ");
		for (Entreprise e : ents)
			System.out.println(e);
	}

	@Test
	public void testFindByNomEntContaining() {
		List<Entreprise> ents = entrepriseRepository.findByNomEntContains("o");
		System.out.println("LES NOMS DES ENTREPRISES SONT: ");
		for (Entreprise e : ents)
			System.out.println(e);
	}

	@Test
	public void testfindByChiffreAff() {
		List<Entreprise> ents = entrepriseRepository.findByChiffreAff("Riot",
				500.0);
		System.out.println("CHIFFRE AFFAIRE ENTREPRISES: ");
		for (Entreprise e : ents)
			System.out.println(e);
	}

	@Test
	public void testfindBySecteur() {
		Secteur sec = new Secteur();
		sec.setIdSec(2L);
		System.out.println("SECTEUR ENTREPRISES: ");
		List<Entreprise> ents = entrepriseRepository.findBySecteur(sec);
		for (Entreprise e : ents)
			System.out.println(e);
	}

	@Test
	public void testfindBySecteurIdSec() {
		List<Entreprise> ents = entrepriseRepository.findBySecteurIdSec(1L);
		System.out.println("RECHERCHE PAR ID SECTEUR : ");
		for (Entreprise e : ents)
			System.out.println(e);
	}

	@Test
	public void testfindByOrderByNomEntAsc() {
		List<Entreprise> ents = entrepriseRepository.findByOrderByNomEntAsc();
		System.out.println("ORDRE CROISSANT DES NOMS ENTREPRISES: ");
		for (Entreprise e : ents)
			System.out.println(e);
	}

	@Test
	public void testTrierEntsNomsPrix() {
		List<Entreprise> ents = entrepriseRepository.trierEntreprisesNomsChiffre();
		System.out.println("ORDRE CROISSANT NOMS / DECROISSANT CHIFFRE AFFAIRE : ");
		for (Entreprise e : ents)
			System.out.println(e);
	}
}
