import { Cars } from './../interface/cars';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CarsService {

  getAllCars(): Promise<Cars[]> {
    return fetch('../assets/db.json')
      .then(res => res.json())
      .then((res) => res)
  }

  getAvailableCars(): Promise<Cars[]> {
    return this.getAllCars()
      .then(res => res.filter(p => p.available))
  }

  getUnavailableCars(): Promise<Cars[]> {
    return this.getAllCars()
      .then(res => res.filter(p => !p.available))
  }

  getAudiCars(): Promise<Cars[]> {
    return this.getAllCars()
      .then(res => res.filter(p => p.brand === 'Audi'))
  }

  getFiatCars(): Promise<Cars[]> {
    return this.getAllCars()
      .then(res => res.filter(p => p.brand === 'Fiat'))
  }

  getFordCars(): Promise<Cars[]> {
    return this.getAllCars()
      .then(res => res.filter(p => p.brand === 'Ford'))
  }

  randomCars: Cars[] = []
  chosenCars: Cars[] = []

  randomIndex(): number {
    let randomNumber: number = Math.floor(Math.random() * 6);
    return randomNumber;
  }

  getRandomCars() {
    for (let i = 0; i < 2; i++) {
      this.chosenCars.push(this.randomCars[this.randomIndex()]);
    }
  }
}
