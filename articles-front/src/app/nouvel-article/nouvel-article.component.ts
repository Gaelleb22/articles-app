import { Article } from './../models/Article';
import { Component, OnInit } from '@angular/core';
import { DataService } from '../services/data.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-nouvel-article',
  templateUrl: './nouvel-article.component.html',
  styleUrls: ['./nouvel-article.component.css']
})
export class NouvelArticleComponent implements OnInit {

  nouvelArticle: Article = new Article();
  articleSub: Subscription;
  creer: boolean;

  constructor(private _srv: DataService) { }

  ngOnInit(): void {
    this.creer = false;
  }

  submit(): void {
    console.log(this.nouvelArticle);
    this._srv.creerNouvelArticle(this.nouvelArticle);
  }

  creerArticle(libelle: HTMLInputElement, prix: HTMLInputElement): void {
    if (libelle.value !== '' && prix.value !== '') {
      this.nouvelArticle.libelle = libelle.value;
      this.nouvelArticle.prix = parseInt(prix.value, 10);
    }

    this.articleSub = this._srv.addArticle(this.nouvelArticle).subscribe(
      () => { this.creer = true; },
      err => { }
    );
  }

}
