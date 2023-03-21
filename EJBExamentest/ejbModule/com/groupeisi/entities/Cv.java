package com.groupeisi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="cv")
public class Cv extends User{
	@Column(name= "specialiste", length = 30)
    private String specialite;
	@Column(name= "niveauEtude", length = 30)
    private String niveauEetude;
	@Column(name= "experience", length = 80)
    private String  experienceProfessionnelle;
	
	

	

	public Cv() {
		  // Constructeur par défaut sans paramètres
		}



	public Cv(int id, String prenom, String nom, String age, String telephone, String email, String adresse,
			String motdepasse, String specialite, String niveauEetude, String experienceProfessionnelle) {
		super(id, prenom, nom, age, telephone, email, adresse, motdepasse);
		this.specialite = specialite;
		this.niveauEetude = niveauEetude;
		this.experienceProfessionnelle = experienceProfessionnelle;
	}



	public String getSpecialite() {
		return specialite;
	}



	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}



	public String getNiveauEetude() {
		return niveauEetude;
	}



	public void setNiveauEetude(String niveauEetude) {
		this.niveauEetude = niveauEetude;
	}



	public String getExperienceProfessionnelle() {
		return experienceProfessionnelle;
	}



	public void setExperienceProfessionnelle(String experienceProfessionnelle) {
		this.experienceProfessionnelle = experienceProfessionnelle;
	}

	
	

}
