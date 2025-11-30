import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { Restaurant } from '../model/Restaurant';
import { Service } from '../service/service';
import { Router } from '@angular/router';



@Component({
  selector: 'app-restaurant-component',
  standalone: true,
  imports: [CommonModule, HttpClientModule, FormsModule ],
  templateUrl: './restaurant-component.html',
  styleUrl: './restaurant-component.css',
})
export class RestaurantComponent {


     private restaurantList : Restaurant[];
     private http: HttpClient;
     private service: Service;
     private router: Router;

     public constructor(http: HttpClient , service: Service , router: Router){
        this.http = http;
        this.restaurantList = [];
        this.service = service;
        this.router = router;

        this.requestRestaurantFromBE();
     }

      public requestRestaurantFromBE(){

      let getRequest = this.http.get<Restaurant[]>("http://localhost:8080/restaurants");

      getRequest.subscribe(
        (response) => {

              if(response.length > 0){

                for(let index: number = 0; index < response.length ; index++){

                  let restaurant = Object.assign(new Restaurant(),response[index]);
                  console.log(index + "" + restaurant.getName());
                  console.log(restaurant.getName());
                  this.restaurantList.push(restaurant);
                }
              }
            }
      )
    }

    selectRestaurant(form: NgForm) {
        
       
        this.service.setRestaurantId(form.value.restaurantId);
        this.router.navigate(["reservation/address"]);

    }

    public getRestaurants(){
      return this.restaurantList;
    }

}
