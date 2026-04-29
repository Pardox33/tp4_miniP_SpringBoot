package com.nadia.entreprises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import com.nadia.entreprises.entities.Entreprise;
import com.nadia.entreprises.entities.Secteur;

@SpringBootApplication
public class EntreprisesApplication implements CommandLineRunner {

	// @Autowired
	// PasswordEncoder passwordEncoder;

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(EntreprisesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Entreprise.class, Secteur.class);
	}

	/*
	 * @PostConstruct
	 * void init_users() {
	 * //ajouter les rôles
	 * userService.addRole(new Role(null,"ADMIN"));
	 * userService.addRole(new Role(null,"AGENT"));
	 * userService.addRole(new Role(null,"USER"));
	 * 
	 * //ajouter les users
	 * userService.saveUser(new User(null,"admin","123",true,null));
	 * userService.saveUser(new User(null,"nadia","123",true,null));
	 * userService.saveUser(new User(null,"user1","123",true,null));
	 * 
	 * //ajouter les rôles aux users
	 * userService.addRoleToUser("admin", "ADMIN");
	 * 
	 * userService.addRoleToUser("nadia", "USER");
	 * userService.addRoleToUser("nadia", "AGENT");
	 * 
	 * userService.addRoleToUser("user1", "USER");
	 * }
	 */

	// @Override
	// public void run(String... args) throws Exception {
	// // System.out.println("Password Encoded BCRYPT :******************** ");
	// // System.out.println(passwordEncoder.encode("123"));
	// /*
	// * produitService.saveProduit(new Produit("PC Dell", 2600.0, new Date()));
	// * produitService.saveProduit(new Produit("PC Asus", 2800.0, new Date()));
	// * produitService.saveProduit(new Produit("Imp Epson", 900.0, new Date()));
	// */

	// }
}
