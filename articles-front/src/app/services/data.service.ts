import { Article } from './../models/Article';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private _http: HttpClient) { }

  recupererListeArticles(): Observable<Article[]> {
    return this._http.get<Article[]>('http://localhost:8081/articles');
  }

  creerNouvelArticle(article: Article): void {


    this._http.post('http://localhost:8081/articles',
      JSON.stringify(article),
      httpOptions).subscribe((data: any) => {
        console.log(data);
      }, (error: HttpErrorResponse) => {
        console.log('error', error);
        alert(error);
      });
  }

  addArticle(article: Article): Observable<void> {
    return this._http.post<void>(`http://localhost:8081/articles`, article, httpOptions);
  }
}
