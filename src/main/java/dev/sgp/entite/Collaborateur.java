package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {

	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate date_n;
	private String adresse;
	private String numSecu;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private boolean actif;
	
	
	public Collaborateur(String matricule, String nom, String prenom, LocalDate date_n, String adresse, String numSecu,
			String emailPro, String photo, ZonedDateTime dateHeureCreation, boolean actif) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.date_n = date_n;
		this.adresse = adresse;
		this.numSecu = numSecu;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
	}
	
	
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDate_n() {
		return date_n;
	}
	public void setDate_n(LocalDate date_n) {
		this.date_n = date_n;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumSecu() {
		return numSecu;
	}
	public void setNumSecu(String numSecu) {
		this.numSecu = numSecu;
	}
	public String getEmailPro() {
		return emailPro;
	}
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	
	
	
	

}
