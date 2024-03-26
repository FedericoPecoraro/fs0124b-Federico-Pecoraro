import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { getAllPosts } from './Components/posts/posts.component';
import { ActivePostsComponent } from './Components/active-posts/active-posts.component';
import { InactivePostsComponent } from './Components/inactive-posts/inactive-posts.component';
import { HeaderComponent } from './Components/header/header.component';
import { FooterComponent } from './Components/footer/footer.component';
import { MaiuscPipe } from './pipe/maiusc.pipe';
import { BgcolorDirective } from './directive/bgcolor.directive';
import { SinglePostComponent } from './Components/single-post/single-post.component';

@NgModule({
  declarations: [
    AppComponent,
    getAllPosts,
    ActivePostsComponent,
    InactivePostsComponent,
    HeaderComponent,
    FooterComponent,
    MaiuscPipe,
    BgcolorDirective,
    SinglePostComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {

}
