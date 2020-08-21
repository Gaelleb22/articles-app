package dev.articles.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreerArticleDto {
	
	@NotBlank
	@NotNull
	@JsonProperty("libelle")
	private String libelle;
	@NotBlank
	@NotNull
	@JsonProperty("prix")
	private double prix;
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	

}
