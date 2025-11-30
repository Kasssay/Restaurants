import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { RestaurantComponent } from "./restaurant-component/restaurant-component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, RestaurantComponent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Ng_restaurants');
}
