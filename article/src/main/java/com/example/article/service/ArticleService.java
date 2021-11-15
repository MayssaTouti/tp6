package com.example.article.service;

import com.example.article.entities.Article;
import com.example.article.entities.Categorie;

import java.util.List;

import org.springframework.data.jpa.repository.Query;


public interface ArticleService {
	Article saveArticle(Article p);
	Article updateArticle(Article p);
	void deleteArticle(Article p);
	void deleteArticleById(Long id);
    List<Article> getAllArticle();
    Article getArticle(Long id);
    List<Article> testFindArticleByTitreLike(String titre);
    List<Article>  findByTitre(String titre);
    List<Article> trierArticleTitreDate();
 
	List<Article> findByTitreDescription (String titre , String description );
	List<Article> findByCategorie (Categorie categorie);
	List<Article> findByCategorieIdCat(Long id);
  //trier ascendante 
	List<Article> findByOrderByTitreAsc();
	
	

}
