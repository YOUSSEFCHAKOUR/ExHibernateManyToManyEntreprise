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
public class Diplome {

	@Id
	@GeneratedValue
	private String RefDiplome;
	@Column
	private String IntituleDiplome;
	
	@ManyToMany
	@JoinTable(name="Exiger_dip_pro",
	joinColumns=@JoinColumn(name="RefDiplome"),
	inverseJoinColumns=@JoinColumn(name="RefProfil")
			)
	private List<Profil> Profils;

	public String getRefDiplome() {
		return RefDiplome;
	}

	public void setRefDiplome(String refDiplome) {
		RefDiplome = refDiplome;
	}

	public String getIntituleDiplome() {
		return IntituleDiplome;
	}

	public void setIntituleDiplome(String intituleDiplome) {
		IntituleDiplome = intituleDiplome;
	}

	public List<Profil> getProfils() {
		return Profils;
	}

	public void setProfils(List<Profil> profils) {
		Profils = profils;
	}

	public Diplome(String refDiplome, String intituleDiplome, List<Profil> profils) {
		super();
		RefDiplome = refDiplome;
		IntituleDiplome = intituleDiplome;
		Profils = profils;
	}
	
	public Diplome() {}

	@Override
	public String toString() {
		return "Diplome [RefDiplome=" + RefDiplome + ", IntituleDiplome=" + IntituleDiplome 
				+ "]";
	}
	
	
	

}
