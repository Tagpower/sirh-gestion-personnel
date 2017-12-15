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
	private String telephone;
	private String photo;
	private String intitulePoste;
	private Departement departement;
	private ZonedDateTime dateHeureCreation;
	private boolean actif;
	
	private String banque;
	private String bic;
	private String iban;
	
	
	public Collaborateur(String nom, String prenom, LocalDate date_n, String adresse, String numSecu,
			String emailPro, String telephone, String photo, String intitule, Departement dept, String banque, String bic, String iban) {
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = (prenom.charAt(0) + nom).toUpperCase();
		this.date_n = date_n;
		this.adresse = adresse;
		this.numSecu = numSecu;
		this.emailPro = emailPro;
		this.telephone= telephone;
		this.photo = photo;
		this.intitulePoste = intitule;
		this.departement = dept;
		this.dateHeureCreation = ZonedDateTime.now();
		this.actif = true;
		
		this.banque = banque;
		this.bic = bic;
		this.iban = iban;
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
	
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public String getIntitulePoste() {
		return intitulePoste;
	}

	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
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

	public String getBanque() {
		return banque;
	}

	public void setBanque(String banque) {
		this.banque = banque;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	
	
	
	
	

}
