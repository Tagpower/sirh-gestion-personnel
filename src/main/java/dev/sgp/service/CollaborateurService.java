package dev.sgp.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;

public class CollaborateurService {
	
	List<Collaborateur> listeCollaborateurs = new ArrayList<>();
	
	
	public CollaborateurService() {
		listeCollaborateurs.add(new Collaborateur("Tower", "Bill", LocalDate.of(1990, 05, 14), "18 rue des Yaourts", "123456789012345", "aaa@aaa", "8787878787", "person.png", "Développeur", new Departement(3, "Informatique")));
	}

	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateurs;
	}
	
	public void sauvegarderCollaborateur(Collaborateur collab) {
		listeCollaborateurs.add(collab);
	}
	
	
}