package com.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Entreprise {
	@Id
	@GeneratedValue
	 private int NumApe;
	@Column
	 private String Denomination;
	@Column
	 private String Adress;
	 
	 
	 @OneToMany(mappedBy="entreprise")
	 private List<Post> Posts;

	public int getNumApe() {
		return NumApe;
	}

	public void setNumApe(int numApe) {
		NumApe = numApe;
	}

	public String getDenomination() {
		return Denomination;
	}

	public void setDenomination(String denomination) {
		Denomination = denomination;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public List<Post> getPosts() {
		return Posts;
	}

	public void setPosts(List<Post> posts) {
		Posts = posts;
	}

	public Entreprise(int numApe, String denomination, String adress, List<Post> posts) {
		super();
		NumApe = numApe;
		Denomination = denomination;
		Adress = adress;
		Posts = posts;
	}
	 
	 public Entreprise() {}

	@Override
	public String toString() {
		return "Entreprise [NumApe=" + NumApe + ", Denomination=" + Denomination + ", Adress=" + Adress + "]";
	}
	
	 
}
