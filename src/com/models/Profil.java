package com.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Profil {
	
	@Id
	@GeneratedValue
	private String RefProfil;
	@Column
	private String IntituleProfil;
	@Column
	private String NiveauScolaire;
	@Column
	private String ExperienceProfil;
	
	@OneToMany(mappedBy="profil")
	private List<Post> Posts;
	
	@ManyToMany(mappedBy="Profils")
	private List<Qualite> Qualites;
	
	@ManyToMany(mappedBy="Profils")
	private List<Diplome> diplomes;
	
	
	public List<Qualite> getQualites() {
		return Qualites;
	}

	public void setQualites(List<Qualite> qualites) {
		Qualites = qualites;
	}

	public List<Diplome> getDiplomes() {
		return diplomes;
	}

	public void setDiplomes(List<Diplome> diplomes) {
		this.diplomes = diplomes;
	}

	public String getRefProfil() {
		return RefProfil;
	}

	public void setRefProfil(String refProfil) {
		RefProfil = refProfil;
	}

	public String getIntituleProfil() {
		return IntituleProfil;
	}

	public void setIntituleProfil(String intituleProfil) {
		IntituleProfil = intituleProfil;
	}

	public String getNiveauScolaire() {
		return NiveauScolaire;
	}

	public void setNiveauScolaire(String niveauScolaire) {
		NiveauScolaire = niveauScolaire;
	}

	public String getExperienceProfil() {
		return ExperienceProfil;
	}

	public void setExperienceProfil(String experienceProfil) {
		ExperienceProfil = experienceProfil;
	}

	public List<Post> getPosts() {
		return Posts;
	}

	public void setPosts(List<Post> posts) {
		Posts = posts;
	}

	public Profil(String refProfil, String intituleProfil, String niveauScolaire, String experienceProfil,
			List<Post> posts) {
		super();
		RefProfil = refProfil;
		IntituleProfil = intituleProfil;
		NiveauScolaire = niveauScolaire;
		ExperienceProfil = experienceProfil;
		Posts = posts;
	}
	public Profil() {}

	@Override
	public String toString() {
		return "Profil [RefProfil=" + RefProfil + ", IntituleProfil=" + IntituleProfil + ", NiveauScolaire="
				+ NiveauScolaire + ", ExperienceProfil=" + ExperienceProfil + "]";
	}
	
	
}
