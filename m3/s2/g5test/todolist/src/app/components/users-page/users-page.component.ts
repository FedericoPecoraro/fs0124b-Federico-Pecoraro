import { Component } from '@angular/core';
import { iUsers } from '../../interface/users';
import { UsersService } from '../../service/users.service';

@Component({
  selector: 'app-users-page',
  templateUrl: './users-page.component.html',
  styleUrl: './users-page.component.scss'
})
export class UsersPageComponent {
  usersArr: iUsers[] = []
  constructor(private userSvc:UsersService) {
    this.usersArr = this.userSvc.getAllUsers()
  }
}
