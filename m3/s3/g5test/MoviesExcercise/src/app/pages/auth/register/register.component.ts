import { Component } from '@angular/core';
import { iUsers } from '../../../interfaces/users';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent {
  registerData: Partial<iUsers> = {}

  constructor(
    private authSvc: AuthService,
    private router: Router
  ) {}

  signUp() {
    this.authSvc.register(this.registerData)
      .subscribe(data => {
        this.router.navigate(['/'])
      })
  }
}
