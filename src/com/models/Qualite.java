package com.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Qualite {
	@Id
	@GeneratedValue
	private String RefQualite;
	@Column
	private String IntituleQualite;
	
	@ManyToMany
	@JoinTable(name="Exiger_pro_qualite",
	joinColumns=@JoinColumn(name="RefQualite"),
	inverseJoinColumns=@JoinColumn(name="RefProfil")
			)
	private List<Profil> Profils;

	public String getRefQualite() {
		return RefQualite;
	}

	public void setRefQualite(String refQualite) {
		RefQualite = refQualite;
	}

	public String getIntituleQualite() {
		return IntituleQualite;
	}

	public void setIntituleQualite(String intituleQualite) {
		IntituleQualite = intituleQualite;
	}

	public List<Profil> getProfils() {
		return Profils;
	}

	public void setProfils(List<Profil> profils) {
		Profils = profils;
	}

	public Qualite(String refQualite, String intituleQualite) {
		super();
		RefQualite = refQualite;
		IntituleQualite = intituleQualite;
	}
	public Qualite() {}
	
	
	
}
