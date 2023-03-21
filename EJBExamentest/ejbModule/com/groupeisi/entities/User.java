package com.groupeisi.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="user")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
	  private int id;
	  
	  @Column(name= "prenom", length = 30)
	  private String prenom;
	  
	  @Column(name= "nom" ,length = 30)
	  
	  private String nom;
	  
	  @Column(name= "age")
	  
	  private String age;
	  
	  @Column(name= "telephone" ,length = 30)
	  
	  private String telephone;
	  
	  @Column(name= "email", length = 30)
	  private String email;
	  
	  @Column(name= "adresse",length = 30)
	 
	  private String adresse;
	 
	  @Column(name= "motdepasse" ,length = 12)
	  
	  private String motdepasse;
	public User(int id, String prenom, String nom, String age, String telephone, String email, String adresse,
			String motdepasse) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.motdepasse = motdepasse;
	}


	public User() {
		// TODO Auto-generated constructor stub
	}















	public int getId() {
		return id;
	}















	public void setId(int id) {
		this.id = id;
	}















	public String getPrenom() {
		return prenom;
	}















	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}















	public String getNom() {
		return nom;
	}















	public void setNom(String nom) {
		this.nom = nom;
	}















	public String getAge() {
		return age;
	}















	public void setAge(String age) {
		this.age = age;
	}















	public String getTelephone() {
		return telephone;
	}















	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}















	public String getEmail() {
		return email;
	}















	public void setEmail(String email) {
		this.email = email;
	}















	public String getAdresse() {
		return adresse;
	}















	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}















	public String getMotdepasse() {
		return motdepasse;
	}















	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}















	@Override
	  public String toString() {
	    return "User [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", age=" + age
	        + ", telephone=" + telephone + ", adresse=" + adresse + ", motdepasse="+ motdepasse +"]";
	  }
	

}
