 package com.example.article.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.article.entities.Article;
import com.example.article.entities.Categorie;
import com.example.article.repos.ArticleRepository;


@Service
public class ArticleServiceImpl  implements ArticleService {

	
	@Autowired
	ArticleRepository articleRepository;
	
	@Override
	public Article saveArticle(Article p) {
	return articleRepository.save(p);
	}
	@Override
	public Article updateArticle(Article p) {
	return articleRepository.save(p);
	}
	//
	@Override
	public void deleteArticle(Article p) {
		articleRepository.delete(p);
	}
	 @Override
	public void deleteArticleById(Long id) {
		 articleRepository.deleteById(id);
	}
	 //
	 @Override
	 public Article getArticle(Long id) {
	 return articleRepository.findById(id).get();
	 }
	 //
	 @Override
	 public List<Article> getAllArticle() {
	 return articleRepository.findAll();
	 }
	 //
	 @Override
	 public List<Article>  findByTitre(String titre) {
	 return articleRepository.findByTitre(titre);
	 }
	 //
	 @Override
	 public List<Article> testFindArticleByTitreLike(String titre) {
	 return articleRepository.findByTitreLike(titre);
	 }
	 //
	 @Override
	 public List<Article> trierArticleTitreDate() {
	 return articleRepository.trierArticleTitreDate();
	 }
	 //
	 @Override
	 public List<Article> findByCategorie(Categorie categorie) {
	 return articleRepository.findByCategorie(categorie);
	 }

	 
	 //
	 @Override
	 public List<Article> findByCategorieIdCat(Long id) {
	 return articleRepository.findByCategorieIdCat(id);
	 }

	 //
	 @Override
	 public List<Article> findByOrderByTitreAsc() {
	 return articleRepository.findByOrderByTitreAsc();
	 }
	 @Override
	  public 	List<Article> findByTitreDescription (String titre , String description )
		{
			return articleRepository.findByTitreDescription(titre, description);
		}
	 
	 }
	 
		
		

	

