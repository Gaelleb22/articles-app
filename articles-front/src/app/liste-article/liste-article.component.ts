import { Component, OnInit } from '@angular/core';
import { Article } from '../models/Article';
import { Subscription } from 'rxjs';
import { DataService } from '../services/data.service';

@Component({
  selector: 'app-liste-article',
  templateUrl: './liste-article.component.html',
  styleUrls: ['./liste-article.component.css']
})
export class ListeArticleComponent implements OnInit {
  listeArticles: Article[];
  articleSub: Subscription;

  constructor(private _srv: DataService) { }

  ngOnInit(): void {
    this.articleSub = this._srv.recupererListeArticles().subscribe(
      valeur => {
        this.listeArticles = valeur;
      }
    );
  }

}
