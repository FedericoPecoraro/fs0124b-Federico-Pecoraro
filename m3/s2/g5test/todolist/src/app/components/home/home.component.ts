import { Component, Input } from '@angular/core';
import { iTodolist } from '../../interface/todolist';
import { TodolistService } from '../../service/todolist.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
  tasksArr!: iTodolist[]
  @Input() tasks!:iTodolist
}
