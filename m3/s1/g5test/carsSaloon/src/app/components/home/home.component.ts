import { Cars } from './../../interface/cars';
import { CarsService } from './../../service/cars.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

  randomCars: Cars[] = []
  chosenCars: Cars[] = []

  constructor(private carsSvc: CarsService) { }

  ngOnInit() {

    this.carsSvc.getAllCars().then(res => {

      this.randomCars = res
      this.carsSvc.randomIndex()

      for (let i = 0; i < 2; i++) {
        this.chosenCars.push(this.randomCars[this.carsSvc.randomIndex()]);
      }
    })
  }
}
