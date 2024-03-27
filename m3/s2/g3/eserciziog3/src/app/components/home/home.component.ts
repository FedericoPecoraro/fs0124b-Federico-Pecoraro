import { iPhone } from './../../interface/product';
import { Component } from '@angular/core';
import { ProductService } from '../../service/product.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

  phone: iPhone[] = []

  constructor(private phoneSvc:ProductService){}

ngOnInit(){
  this.phoneSvc.getAll().subscribe(phones =>{
    this.phone = phones.products
})
}}
