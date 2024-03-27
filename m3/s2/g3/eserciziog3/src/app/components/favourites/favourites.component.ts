import { Component } from '@angular/core';
import { iPhone } from '../../interface/product';
import { ProductService } from '../../service/product.service';

@Component({
  selector: 'app-favourites',
  templateUrl: './favourites.component.html',
  styleUrl: './favourites.component.scss'
})
export class FavouritesComponent {
  favourite: iPhone[] = []

  constructor(private phoneSvc:ProductService){}

  ngOnInit(){
    this.favourite = this.phoneSvc.getFavourite()
  }

  removeFavourite(index:number){
    this.favourite.splice(index,1)
  }
}
