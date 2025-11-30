import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Service } from '../service/service';

@Component({
  selector: 'app-address-component',
  standalone : true,
  imports: [CommonModule, HttpClientModule, FormsModule],
  templateUrl: './address-component.html',
  styleUrl: './address-component.css',
})
export class AddressComponent {
[x: string]: any;
    
    
     private http: HttpClient;
     private service: Service;
     private router: Router;

     public constructor(http: HttpClient , service: Service , router: Router){
        this.http = http;
        this.service = service;
        this.router = router;

     }
  
  public saveAddress(form: NgForm ) {
    this.service.setGuestName(form.value.guestName);
    this.service.setGuestPhone(form.value.guestPhone);

    this.router.navigate(["reservation/date"]);
}




}
