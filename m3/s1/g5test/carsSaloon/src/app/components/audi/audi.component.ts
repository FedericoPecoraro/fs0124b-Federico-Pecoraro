import { CarsService } from '../../service/cars.service';
import { Cars } from './../../interface/cars';
import { Component } from '@angular/core';

@Component({
  selector: 'app-audi',
  templateUrl: './audi.component.html',
  styleUrl: './audi.component.scss'
})
export class AudiComponent {
  carsArr:Cars[] = [];

  constructor(private carsSvc: CarsService){}

  ngOnInit(){

    this.carsSvc.getAudiCars().then(res => {

      this.carsArr = res;

    })

  }
}
