package com.example.article;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.article.entities.Article;
import com.example.article.entities.Categorie;
import com.example.article.repos.ArticleRepository;



@SpringBootTest
class ArticleApplicationTests {

@Autowired
private ArticleRepository articleRepository;

@Test
public void testCreateArticle() {
Article prod = new Article("covid_19","La pandémie de Covid-19 se développe en Tunisie officiellement depuis le 2 mars 2020",new Date());
articleRepository.save(prod);
}	
	
@Test
public void testFindArticle()
{
Article a = articleRepository.findById(1L).get(); 
System.out.println(a);
}	
	
@Test
public void testUpdateArticle()
{
Article p = articleRepository.findById(1L).get();
p.setTitre("pondémie covidt-19");
articleRepository.save(p);
}

public void testDeleteArticle()
{
	articleRepository.deleteById(1L);;
}
@Test
public void testListerTousArticle()
{
List<Article> prods = articleRepository.findAll();
for (Article p : prods)
{
System.out.println(p);
}
}
@Test
public void testFindArticleByTitre()
{
List<Article> arts = articleRepository.findByTitre("covid_19");  
for (Article p : arts)

System.out.println(p);
}	
@Test
public void testFindArticleByTitreLike()
{
List<Article> arts = articleRepository.findByTitreLike("covid_19");   
for (Article p : arts)

System.out.println(p);
}
@Test
public void testfindByTitreDescription()
{
List<Article> prods = articleRepository.findByTitreDescription("covid_19","La pandémie de Covid-19 se développe en Tunisie officiellement depuis le 2 mars 2020");
for (Article p : prods)
{
System.out.println(p);
}
}
/*@Test
public void testfindByCategorie()
{
Categorie cat = new Categorie();
cat.setIdCat(1L);
List<Article> prods = articleRepository.findByCategorie(cat);
for (Article p : prods)
{
System.out.println(p);
}
}*/
@Test
public void findByCategorieIdCat()
{
List<Article> prods = articleRepository.findByCategorieIdCat(1L);
for (Article p : prods)
{
System.out.println(p);
}
 }

@Test
public void testfindByOrderByNomProduitAsc()
{
List<Article> prods = 
articleRepository.findByOrderByTitreAsc(); 
for (Article p : prods)
{
System.out.println(p);
}
}


@Test
public void testTrierArticleTitreDate()
{
List<Article> prods = articleRepository.trierArticleTitreDate(); 
for (Article p : prods)
{
System.out.println(p);
}
}


}
