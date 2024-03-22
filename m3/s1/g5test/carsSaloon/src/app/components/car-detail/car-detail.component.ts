import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Cars } from '../../interface/cars';
import { CarsService } from '../../service/cars.service';

@Component({
  selector: 'app-car-detail',
  templateUrl: './car-detail.component.html',
  styleUrl: './car-detail.component.scss'
})
export class CarDetailComponent {
  car:Cars | undefined;
  constructor(private router:ActivatedRoute, private carsSvc: CarsService){}
  ngOnInit(){
    this.router.params.subscribe((routeParameters:any) => {
      this.carsSvc.getCarById(routeParameters.id).then ( res => this.car = res)
    })
  }
}
