import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { UsersPageComponent } from './components/users-page/users-page.component';
import { TasksActiveComponent } from './components/tasks-active/tasks-active.component';
import { TasksInactiveComponent } from './components/tasks-inactive/tasks-inactive.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'users-page',
    component: UsersPageComponent
  },
  {
    path: 'tasks-active',
    component: TasksActiveComponent
  },
  {
    path: 'tasks-inactive',
    component: TasksInactiveComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
