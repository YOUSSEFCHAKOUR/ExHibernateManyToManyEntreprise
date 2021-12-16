package com.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Tache {
	@Id
	@GeneratedValue
	private String reftache;
	@Column
	private String libeltache;
	
	@ManyToMany
	@JoinTable(name="Assumer_tache_post",
	joinColumns=@JoinColumn(name="reftache"),
	inverseJoinColumns=@JoinColumn(name="Refpost")
			)
	private List<Post> Posts;

	public String getReftache() {
		return reftache;
	}

	public void setReftache(String reftache) {
		this.reftache = reftache;
	}

	public String getLibeltache() {
		return libeltache;
	}

	public void setLibeltache(String libeltache) {
		this.libeltache = libeltache;
	}

	public List<Post> getPosts() {
		return Posts;
	}

	public void setPosts(List<Post> posts) {
		Posts = posts;
	}

	public Tache(String reftache, String libeltache) {
		super();
		this.reftache = reftache;
		this.libeltache = libeltache;
	}
	public Tache() {}

	@Override
	public String toString() {
		return "Tache [reftache=" + reftache + ", libeltache=" + libeltache + "]";
	}
	
	
	
	
	
	
	
}
