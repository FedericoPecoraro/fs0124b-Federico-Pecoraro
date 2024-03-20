import { Component } from '@angular/core';
import { iPost } from '../../Models/post';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrl: './posts.component.scss'
})
export class PostsComponent {

  postArr:iPost[] = [];

  ngOnInit(){
    fetch('../assets/db.json')
    .then(post => post.json())
    .then((post:iPost[]) => this.postArr = post)
  }

  Dis(){
    this.postArr = this.postArr.filter(p => p.active)
  }

  notDis(){
    this.postArr = this.postArr.filter(p => !p.active)
  }

}
