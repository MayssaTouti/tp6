package com.example.article.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data

@AllArgsConstructor
@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCat;
	private String nomCat;
	private String descriptionCat;

	
	@OneToMany(mappedBy = "categorie")
	@JsonIgnore
	private List<Article> articles;

	
	

	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@OneToMany(mappedBy ="categorie")
	private List<Article> aticles ;

	public Long getIdCat() {
		return idCat;
	}

	public void setIdCat(Long idCat) {
		this.idCat = idCat;
	}

	public String getNomCat() {
		return nomCat;
	}

	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}

	public String getDescriptionCat() {
		return descriptionCat;
	}

	public void setDescriptionCat(String descriptionCat) {
		this.descriptionCat = descriptionCat;
	}

	public List<Article> getAticles() {
		return aticles;
	}

	public void setAticles(List<Article> aticles) {
		this.aticles = aticles;
	} 

	
	
	
}
