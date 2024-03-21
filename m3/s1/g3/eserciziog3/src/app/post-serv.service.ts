import { PostContent } from './Models/post-content';
import { iPost } from './Models/post';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class PostServService {

  getAllPosts():Promise<iPost[]>{

    return fetch('../assets/db.json')
    .then(res => res.json())
    .then((res:PostContent) => res.posts)
  }

  getActivePosts():Promise<iPost[]>{
    return this.getAllPosts()
    .then(res => res.filter(p => p.active))
  }

  getInactivePosts():Promise<iPost[]>{
    return this.getAllPosts()
    .then(res => res.filter(p => !p.active))
  }
}
