import { Component } from '@angular/core';
import { iPost } from '../../Models/post';
import { PostServService } from '../../post-serv.service';

@Component({
  selector: 'app-inactive-posts',
  templateUrl: './inactive-posts.component.html',
  styleUrl: './inactive-posts.component.scss'
})
export class InactivePostsComponent {
  posts: iPost[] = [];

  constructor(private postSvc:PostServService) {
    this.posts = this.postSvc.getInactivePosts()
  }
}
