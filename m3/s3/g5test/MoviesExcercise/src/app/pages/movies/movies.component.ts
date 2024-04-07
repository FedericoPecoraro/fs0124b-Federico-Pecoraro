import { Component } from '@angular/core';
import { iMovies } from '../../interfaces/movies';
import { GeneralService } from '../../service/general.service';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrl: './movies.component.scss'
})
export class MoviesComponent {
  moviesArr: iMovies[] = []

  constructor(private movieSvc: GeneralService) {}

  ngOnInit():void {
    this.movieSvc.$movie.subscribe(movie => {
      this.moviesArr = movie
    })
  }
}
