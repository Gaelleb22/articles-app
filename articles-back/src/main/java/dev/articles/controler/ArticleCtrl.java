package dev.articles.controler;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.articles.dto.ArticleDto;
import dev.articles.dto.CreerArticleDto;
import dev.articles.entitee.Article;
import dev.articles.service.ArticleService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("articles")
public class ArticleCtrl {
	
	@Autowired
	private ArticleService articleService;
	
	@GetMapping
	public ResponseEntity<?> findArticles(){
		List<Article> articles = articleService.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(articles);
	}
	
	@PostMapping
	public ArticleDto creerArticle(@RequestBody @Valid CreerArticleDto article) {
		Article articleCreer = articleService.creer(article.getLibelle(), article.getPrix());
		
		ArticleDto articleDto = new ArticleDto();
		articleDto.setId(articleCreer.getId());
		articleDto.setLibelle(articleCreer.getLibelle());
		articleDto.setPrix(articleCreer.getPrix());
		
		return articleDto;
	}

}
