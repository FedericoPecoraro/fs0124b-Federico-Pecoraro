import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment.development';
import { iMovies } from '../interfaces/movies';
import { iUsers } from '../interfaces/users';
import { BehaviorSubject } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class GeneralService {

  moviesUrl = environment.moviesUrl;
  usersUrl = environment.usersUrl

  moviesArr: iMovies[] = []
  usersArr: iUsers[] = []

  movieSubject = new BehaviorSubject<iMovies[]>([]);
  userSubject = new BehaviorSubject<iUsers[]>([])

  $movie = this.movieSubject.asObservable();
  $user = this.userSubject.asObservable()

  constructor(private http:HttpClient) {
    this.getAllMovies().subscribe(data => {
      this.movieSubject.next(data)
      this.moviesArr = data
    })

    this.getAllUsers().subscribe(data => {
      this.userSubject.next(data)
      this.usersArr = data
    })
  }

  getAllMovies(){
    return this.http.get<iMovies[]>(this.moviesUrl)
  }

  getAllUsers(){
    return this.http.get<iUsers[]>(this.usersUrl)
  }
}
