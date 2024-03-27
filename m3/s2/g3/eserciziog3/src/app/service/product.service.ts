import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { iPhone } from '../interface/product';
import { Phone } from '../interface/phone';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  apiUrl:string = 'https://dummyjson.com/products';

  constructor(private http:HttpClient){}

  getAll(){
    return this.http.get<Phone>(this.apiUrl)
  }

  getFavourite(){

  }

  addFavourite(){

  }

}
