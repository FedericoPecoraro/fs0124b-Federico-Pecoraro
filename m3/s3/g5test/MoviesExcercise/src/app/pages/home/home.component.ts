import { Component } from '@angular/core';
import { AuthService } from '../auth/auth.service';
import { iUsers } from '../../interfaces/users';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
  constructor(private authSvc:AuthService){}

  user:iUsers|undefined;

  ngOnInit(){
    this.authSvc.user$.subscribe(user => {
      this.user = user || undefined;
    })
  }
}
