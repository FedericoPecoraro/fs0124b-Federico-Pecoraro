import { Component } from '@angular/core';
import { iPost } from '../../Models/post';
import { PostServService } from '../../post-serv.service';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrl: './posts.component.scss'
})
export class getAllPosts {
  posts: iPost[] = [];

  constructor(private postSvc:PostServService) {
    this.posts = this.postSvc.getAllPosts()
  }
}
