package dev.articles.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dev.articles.repository.ArticleRepository;
import dev.articles.entitee.Article;

@Service
public class ArticleService {
	
	private ArticleRepository articleRepo;

	public ArticleService(ArticleRepository articleRepo) {
		super();
		this.articleRepo = articleRepo;
	}
	
	public List<Article> findAll(){
		return articleRepo.findAll();
	}
	
	@Transactional
	public Article creer(String libelle, double prix) {
		Article article = new Article();
		article.setLibelle(libelle);
		article.setPrix(prix);
		
		Article articleSauvegarde = this.articleRepo.save(article);
		return articleSauvegarde;
	}

}
