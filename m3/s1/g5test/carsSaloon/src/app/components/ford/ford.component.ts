import { Component } from '@angular/core';
import { Cars } from '../../interface/cars';
import { CarsService } from '../../service/cars.service';

@Component({
  selector: 'app-ford',
  templateUrl: './ford.component.html',
  styleUrl: './ford.component.scss'
})
export class FordComponent {
  carsArr:Cars[] = [];

  constructor(private carsSvc: CarsService){}

  ngOnInit(){

    this.carsSvc.getFordCars().then(res => {

      this.carsArr = res;

    })

  }
}
