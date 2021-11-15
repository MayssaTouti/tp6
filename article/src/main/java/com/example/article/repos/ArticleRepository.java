package com.example.article.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.article.entities.Article;
import com.example.article.entities.Categorie; 


@RepositoryRestResource(path = "rest")
public interface ArticleRepository extends JpaRepository<Article , Long> {

	List<Article> findByTitre(String titre);
	List<Article> findByTitreLike(String titre);
	
	@Query("select p from Article p where p.titre like %?1 and p.description like %?2")
	List<Article> findByTitreDescription(String titre , String description );
	
	
	@Query("select p from Article p where p.categorie = ?1")
	List<Article> findByCategorie (Categorie categorie);
	
	List<Article> findByCategorieIdCat(Long id);
    //trier ascendante 
	List<Article> findByOrderByTitreAsc();
	
	@Query("select p from Article p order by p.titre ASC, p.datePoste DESC")
	List<Article> trierArticleTitreDate ();


}
