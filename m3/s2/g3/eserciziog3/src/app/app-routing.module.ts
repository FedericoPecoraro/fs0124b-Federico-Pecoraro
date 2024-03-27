import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { FavouritesComponent } from './components/favourites/favourites.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'favourite',
    component: FavouritesComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
