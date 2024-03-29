import { Component } from '@angular/core';
import { iTodolist } from '../../interface/todolist';
import { TodolistService } from '../../service/todolist.service';

@Component({
  selector: 'app-tasks-active',
  templateUrl: './tasks-active.component.html',
  styleUrl: './tasks-active.component.scss'
})
export class TasksActiveComponent {
  tasksArr: iTodolist[] = []
  constructor(private taskSvc:TodolistService) {
    this.tasksArr = this.taskSvc.getActiveTasks()
  }
}
