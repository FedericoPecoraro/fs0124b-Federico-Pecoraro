import { Component } from '@angular/core';
import { AuthService } from '../../pages/auth/auth.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.scss'
})
export class NavbarComponent {
  show: boolean = false
  isUserLoggedIn: boolean = false;

  constructor(private authSvc: AuthService) { }

  ngOnInit() {
    this.authSvc.isLoggedIn$.subscribe(data => {
      this.isUserLoggedIn = data;
    })
  }

  logout() {
    this.authSvc.logout()
  }
}
