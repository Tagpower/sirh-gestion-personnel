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
import dev.sgp.entite.Departement;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.util.Constantes;

public class AjouterCollaborateurController extends HttpServlet {
	
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;	
	private DepartementService deptService = Constantes.DEPT_SERVICE;
	
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
		LocalDate ddn = LocalDate.parse(req.getParameter("ddn"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		String adresse = req.getParameter("adresse");
		String numSecu = req.getParameter("numSecu");
		String email = prenom + "." + nom + "@" + SOCIETE + ".com";
		String tel = req.getParameter("telephone");
		String photo = "person.png";
		
		String intitule = "Développeur";
		Departement dept = deptService.listerDepartements().get(3);
		
		
		
		if (numSecu.length() != 15) {
			resp.sendError(400, "Le numéro de sécurité sociale doit faire 15 caractères");
		} else {
				
			Collaborateur co = new Collaborateur(nom, prenom, ddn, adresse, numSecu, email, tel, photo, intitule, dept);
			
			collabService.sauvegarderCollaborateur(co);
			
			req.setAttribute("listeCollab", collabService.listerCollaborateurs());
			req.setAttribute("listeDept", deptService.listerDepartements());
//			req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
			resp.sendRedirect(req.getContextPath()+"/collaborateurs/lister");
		}
	}
	
	
	
	
	
}