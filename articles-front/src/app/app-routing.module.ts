import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NouvelArticleComponent } from './nouvel-article/nouvel-article.component';
import { ListeArticleComponent } from './liste-article/liste-article.component';

const routes: Routes = [
  { path: 'nouveau', component: NouvelArticleComponent },
  { path: 'liste-article', component: ListeArticleComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
