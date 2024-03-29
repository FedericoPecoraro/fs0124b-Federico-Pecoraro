import { Component } from '@angular/core';
import { iTodolist } from '../../interface/todolist';
import { TodolistService } from '../../service/todolist.service';

@Component({
  selector: 'app-tasks-inactive',
  templateUrl: './tasks-inactive.component.html',
  styleUrl: './tasks-inactive.component.scss'
})
export class TasksInactiveComponent {
  tasksArr: iTodolist[] = []
  constructor(private taskSvc:TodolistService) {
    this.tasksArr = this.taskSvc.getInactiveTasks()
  }
}
