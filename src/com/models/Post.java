package com.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.criteria.Fetch;

@Entity
@Table
public class Post {
	
	@Id
	@GeneratedValue
	private String Refpost;
	@Column
	private String Intitulepost;
	@Column
	private String remuneration;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="NumApe")
	private Entreprise entreprise;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="RefProfil")
	private Profil profil;
	
	@ManyToMany(mappedBy="Posts")
	private List<Tache> taches;

	public String getRefpost() {
		return Refpost;
	}

	public void setRefpost(String refpost) {
		Refpost = refpost;
	}

	public String getIntitulepost() {
		return Intitulepost;
	}

	public void setIntitulepost(String intitulepost) {
		Intitulepost = intitulepost;
	}

	public String getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(String remuneration) {
		this.remuneration = remuneration;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public Profil getProfil() {
		return profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}

	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}

	public Post(String refpost, String intitulepost, String remuneration) {
		super();
		Refpost = refpost;
		Intitulepost = intitulepost;
		this.remuneration = remuneration;
	}
	
	
	public Post() {}

	@Override
	public String toString() {
		return "Post [Refpost=" + Refpost + ", Intitulepost=" + Intitulepost + ", remuneration=" + remuneration + "]";
	}
	
	
}
