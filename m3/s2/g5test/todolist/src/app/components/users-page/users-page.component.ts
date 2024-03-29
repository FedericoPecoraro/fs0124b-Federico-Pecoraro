import { Component } from '@angular/core';
import { iUsers } from '../../interface/users';
import { UsersService } from '../../service/users.service';
import { TodolistService } from '../../service/todolist.service';
import { iTodolist } from '../../interface/todolist';

@Component({
  selector: 'app-users-page',
  templateUrl: './users-page.component.html',
  styleUrl: './users-page.component.scss'
})
export class UsersPageComponent {
  usersArr: iUsers[] = []
  constructor(private userSvc:UsersService, private taskSvc:TodolistService) {
    this.usersArr = this.userSvc.getAllUsers()
  }

  getTasksByUserId(userId:number): iTodolist[] {
    return this.taskSvc.getTasksByUserId(userId)
  }
}
