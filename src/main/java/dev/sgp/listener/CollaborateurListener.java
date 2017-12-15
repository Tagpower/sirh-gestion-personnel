package dev.sgp.listener;

import java.time.LocalDate;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.util.Constantes;

@WebListener
public class CollaborateurListener implements ServletContextListener {
		
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;	
	private DepartementService deptService = Constantes.DEPT_SERVICE;

	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		deptService.sauvegarderDepartement(new Departement(0, "Comptabilité"));
		deptService.sauvegarderDepartement(new Departement(1, "Ressources humaines"));
		deptService.sauvegarderDepartement(new Departement(2, "Informatique"));
		deptService.sauvegarderDepartement(new Departement(3, "Administratif"));
	
		collabService.sauvegarderCollaborateur(new Collaborateur("Tower", "Bill", LocalDate.of(1990, 05, 14), "18 rue des Yaourts", "123456789012345", "bill@billy.fr", "8787878787", "person.png", "Développeur", deptService.listerDepartements().get(2), "","",""));
		collabService.sauvegarderCollaborateur(new Collaborateur("Power", "Tag", LocalDate.of(1994, 07, 14), "18 rue de la chèvre", "123456787654321", "tagpower@tag.fr", "0240024002", "person.png", "Génie absolu", deptService.listerDepartements().get(1), "","",""));
		collabService.sauvegarderCollaborateur(new Collaborateur("Grelier", "Jean", LocalDate.of(1895, 01, 2), "?? rue Général Buat", "123456787654320", "jean.grelier@univ-nantes.fr", "0101010101", "person.png", "Prof de gestion", deptService.listerDepartements().get(0), "","",""));
		collabService.sauvegarderCollaborateur(new Collaborateur("Algar", "Michael", LocalDate.of(1962, 9, 21), "50 rue du punk", "223456787654321", "olga@toydolls.co.uk", "555666777", "olga.jpg", "Guitariste", deptService.listerDepartements().get(3), "","",""));

		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		
		
		
	}
	
	

}
