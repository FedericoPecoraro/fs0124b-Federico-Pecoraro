import { Component } from '@angular/core';
import { iPost } from '../../Models/post';
import { PostServService } from '../../post-serv.service';

@Component({
  selector: 'app-inactive-posts',
  templateUrl: './inactive-posts.component.html',
  styleUrl: './inactive-posts.component.scss'
})
export class InactivePostsComponent {
  postsArr:iPost[] = [];

  constructor(private postSvc:PostServService){}

  ngOnInit(){

    this.postSvc.getInactivePosts().then(res => {

      this.postsArr = res;

    })

  }
}
