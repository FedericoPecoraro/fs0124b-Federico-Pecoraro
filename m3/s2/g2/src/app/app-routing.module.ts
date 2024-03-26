import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { getAllPosts } from './Components/posts/posts.component';
import { ActivePostsComponent } from './Components/active-posts/active-posts.component';
import { InactivePostsComponent } from './Components/inactive-posts/inactive-posts.component';

const routes: Routes = [
  {
    path: '',
    component: getAllPosts
  },
  {
    path: 'active-posts',
    component: ActivePostsComponent
  },
  {
    path: 'inactive-posts',
    component: InactivePostsComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
