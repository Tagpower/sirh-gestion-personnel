package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class EditerCollaborateurController extends HttpServlet {

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		// recupere la valeur d'un parametre dont le nom est avecPhoto
		String matriculeParam = req.getParameter("matricule");

		// recupere la valeur d'un parametre dont le nom est departement
		resp.setContentType("text/html");
		// code HTML ecrit dans le corps de la reponse
		
		resp.getWriter().write("<h1>Édition de collaborateur</h1>");
		if (matriculeParam == null || matriculeParam.equals("")) {
			resp.sendError(400, "Erreur : un matricule est attendu");
		} else {
			resp.getWriter().write("<p>Matricule="+ matriculeParam + "</p>");
		}
	}
	
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String matriculeParam = req.getParameter("matricule");
		String titreParam = req.getParameter("titre");
		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");
		
		//NB : utiliser x-www-form-urlencoded
		
		//Vérification des paramètres
		ArrayList<String> missingParameters = new ArrayList<>();
		if (matriculeParam == null || matriculeParam.equals("")) {
			missingParameters.add("matricule");
		}
		if (titreParam == null || titreParam.equals("")) {
			missingParameters.add("titre");
		}
		if (nomParam == null || nomParam.equals("")) {
			missingParameters.add("nom");
		}
		if (prenomParam == null || prenomParam.equals("")) {
			missingParameters.add("prenom");
		}
		
		resp.setContentType("text/html");
		// code HTML ecrit dans le corps de la reponse
		
		if (missingParameters.size() > 0) {
			StringBuilder message = new StringBuilder("Les paramètres suivants sont incorrects : ");
			for (String p : missingParameters) {
				message.append(p).append(" ");
			}
			resp.sendError(400, message.toString());
		} else {
			resp.setStatus(201);
			resp.getWriter().write("<h1>Édition de collaborateur</h1>");
			resp.getWriter().write("<p>Matricule="+ matriculeParam + "</p>");
			resp.getWriter().write("<p>Titre="+ titreParam + "</p>");
			resp.getWriter().write("<p>Nom="+ nomParam + "</p>");
			resp.getWriter().write("<p>Prenom="+ prenomParam + "</p>");			
		}
		
		
	}
	
	
}
