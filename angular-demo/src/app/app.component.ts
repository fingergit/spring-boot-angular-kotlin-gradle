import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-demo';

  data = {};
  constructor (private httpClient: HttpClient) {
    httpClient.get("/resource").subscribe(
      data =>
        this.data = data
    )
  }
}
