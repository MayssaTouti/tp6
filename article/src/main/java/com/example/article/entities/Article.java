package com.example.article.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Article {

	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArt; 
	private String titre ; 
    private String description ; 
    private Date datePoste ; 
    //plusieur article peut avoir un seul article 
    @ManyToOne
    private Categorie categorie; 
    
    
    
  
	@Override
	public String toString() {
		return "Article [idArt=" + idArt + ", titre=" + titre + ", description=" + description + ", datePoste="
				+ datePoste + "]";
	}




	public Article(String titre, String description, Date datePoste) {
		super();
		this.titre = titre;
		this.description = description;
		this.datePoste = datePoste;
	}




	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Long getIdArt() {
		return idArt;
	}




	public void setIdArt(Long idArt) {
		this.idArt = idArt;
	}




	public String getTitre() {
		return titre;
	}




	public void setTitre(String titre) {
		this.titre = titre;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public Date getDatePoste() {
		return datePoste;
	}




	public void setDatePoste(Date datePoste) {
		this.datePoste = datePoste;
	}




	public Categorie getCategorie() {
		return categorie;
	}




	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}




	
	
}//fin classe article 
