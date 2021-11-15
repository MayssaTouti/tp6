package com.example.article.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "titre", types = { Article.class })
public interface ProduitProjection {
	public String getTitre();
}
