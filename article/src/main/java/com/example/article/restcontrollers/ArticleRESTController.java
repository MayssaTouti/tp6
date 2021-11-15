package com.example.article.restcontrollers;




import java.util.List;



   
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.article.entities.Article;
import com.example.article.service.ArticleService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ArticleRESTController {
	@Autowired
	ArticleService articleService;
	
	@RequestMapping(path  ="all",method= RequestMethod.GET)
	public List<Article> getAllArticle() {
		
	return articleService.getAllArticle();
	}

	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Article getArticle(@PathVariable("id") Long id) {
	return articleService.getArticle(id);
	 }
	@RequestMapping(method = RequestMethod.POST)
	public Article saveArticle(@RequestBody Article article) {
	return articleService.saveArticle(article);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Article updateProduit(@RequestBody Article article) {
	return articleService.updateArticle(article);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteArticle(@PathVariable("id") Long id)
	{
		articleService.deleteArticleById(id);
	}
	@RequestMapping(value="/artcat/{idCat}",method = RequestMethod.GET)
	public List<Article> getArticleByCategorie(@PathVariable("idCat") Long idCat) {
	return articleService.findByCategorieIdCat(idCat);
	}

}
