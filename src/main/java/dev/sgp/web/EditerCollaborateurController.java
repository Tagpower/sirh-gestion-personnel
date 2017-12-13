package dev.sgp.web;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

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
		
		resp.setContentType("text/html");
		// code HTML ecrit dans le corps de la reponse
		
//		
//		BufferedReader reader = req.getReader();
//		String line;
//		do {
//			
//		} while (line != null);
		
		
		
		resp.getWriter().write("<h1>Édition de collaborateur</h1>");
		if (matriculeParam == null || matriculeParam.equals("")) {
			resp.getWriter().write("<p>Erreur : un matricule est attendu</p>");
		} else {
			resp.getWriter().write("<p>Matricule="+ matriculeParam + "</p>");
			resp.getWriter().write("<p>Titre="+ titreParam + "</p>");
			resp.getWriter().write("<p>Nom="+ nomParam + "</p>");
			resp.getWriter().write("<p>Prenom="+ prenomParam + "</p>");
		}
		
	}
}
