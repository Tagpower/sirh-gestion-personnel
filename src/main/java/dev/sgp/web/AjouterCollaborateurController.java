package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class AjouterCollaborateurController extends HttpServlet {
	
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;	
	private final String SOCIETE = ResourceBundle.getBundle("application").getString("societe");
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/ajouterCollaborateur.jsp")
		.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String matricule = (prenom.charAt(0) + nom).toUpperCase();
		LocalDate ddn = LocalDate.parse(req.getParameter("ddn"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		String adresse = req.getParameter("adresse");
		String numSecu = req.getParameter("numSecu");
		String email = prenom + "." + nom + "@" + SOCIETE + ".com";
		String photo = "person.png";
		//ZonedDateTime dateCreation = ZonedDateTime.now();
		
		
		
		if (numSecu.length() != 15) {
			resp.sendError(400, "Le numéro de sécurité sociale doit faire 15 caractères");
		} else {
				
			
			
			Collaborateur co = new Collaborateur(matricule, nom, prenom, ddn, adresse, numSecu, email, photo);
			CollaborateurService cs = new CollaborateurService();
			cs.sauvegarderCollaborateur(co);
			
			req.setAttribute("listeNoms", cs.listerCollaborateurs());
			req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
			.forward(req, resp);
			resp.sendRedirect("/WEB-INF/views/collab/listerCollaborateurs.jsp");
		}
	}
	
	
	
	
	
}