import { Component, Input } from '@angular/core';
import { iTodolist } from '../../interface/todolist';
import { TodolistService } from '../../service/todolist.service';
import { iUsers } from '../../interface/users';
import { UsersService } from '../../service/users.service';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrl: './task.component.scss'
})
export class TaskComponent {
  @Input() task!: iTodolist
  tasksArr: iTodolist[] = []
  usersArr: iUsers[] = []
  constructor(private taskSvc:TodolistService, private userSvc:UsersService) {
    this.tasksArr = this.taskSvc.getAllTasks();
    this.usersArr = this.userSvc.getAllUsers()
  }

  toggleCompleted(taskId: number) {
    this.taskSvc.toggleCompleted(taskId)
  }

  getTasksByUserId(userId:number): iTodolist[] {
    return this.taskSvc.getTasksByUserId(userId)
  }

//  getUserId(userId:iTodolist) {
//    this.userSvc.getUserById(taskArr)
//  }
}
