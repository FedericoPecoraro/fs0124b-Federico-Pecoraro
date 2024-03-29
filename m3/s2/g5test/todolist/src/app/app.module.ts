import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomeComponent } from './components/home/home.component';
import { UsersPageComponent } from './components/users-page/users-page.component';
import { TasksActiveComponent } from './components/tasks-active/tasks-active.component';
import { TasksInactiveComponent } from './components/tasks-inactive/tasks-inactive.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    UsersPageComponent,
    TasksActiveComponent,
    TasksInactiveComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
