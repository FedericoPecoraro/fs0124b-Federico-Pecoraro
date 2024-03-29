import { Component } from '@angular/core';
import { iPost } from '../../Models/post';
import { PostServService } from '../../post-serv.service';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrl: './posts.component.scss'
})
export class PostsComponent {
  postsArr:iPost[] = [];

  constructor(private postSvc:PostServService){}

  ngOnInit(){

    this.postSvc.getAllPosts().then(res => {

      this.postsArr = res;

    })

  }
}
