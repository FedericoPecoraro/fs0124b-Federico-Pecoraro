import { Component } from '@angular/core';
import { Cars } from '../../interface/cars';
import { CarsService } from '../../service/cars.service';

@Component({
  selector: 'app-fiat',
  templateUrl: './fiat.component.html',
  styleUrl: './fiat.component.scss'
})
export class FiatComponent {
  carsArr:Cars[] = [];

  constructor(private carsSvc: CarsService){}

  ngOnInit(){

    this.carsSvc.getFiatCars().then(res => {

      this.carsArr = res;

    })

  }
}
