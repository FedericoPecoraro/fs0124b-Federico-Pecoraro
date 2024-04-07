import { Component } from '@angular/core';
import { iUsers } from '../../interfaces/users';
import { GeneralService } from '../../service/general.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrl: './users.component.scss'
})
export class UsersComponent {
  usersArr: iUsers[] = []

  constructor(private userSvc: GeneralService) {}

  ngOnInit():void {
    this.userSvc.$user.subscribe(user => {
      this.usersArr = user
    })
  }
}
