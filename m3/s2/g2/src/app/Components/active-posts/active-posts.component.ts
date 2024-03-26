import { Component } from '@angular/core';
import { iPost } from '../../Models/post';
import { PostServService } from '../../post-serv.service';

@Component({
  selector: 'app-active-posts',
  templateUrl: './active-posts.component.html',
  styleUrl: './active-posts.component.scss'
})
export class ActivePostsComponent {
  posts: iPost[] = [];

  constructor(private postSvc:PostServService) {
    this.posts = this.postSvc.getActivePosts()
  }
}
