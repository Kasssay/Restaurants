import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { Router } from '@angular/router';

import { Service } from '../service/service';

@Component({
  selector: 'app-date-component',
  standalone:true,
  imports: [CommonModule, HttpClientModule, FormsModule],
  templateUrl: './date-component.html',
  styleUrl: './date-component.css',
})
export class DateComponent {

     private http: HttpClient;
     private service: Service;
     private router: Router;
    

     public constructor(http: HttpClient , service: Service , router: Router){
        this.http = http;
        this.service = service;
        this.router = router;
   
     }

     examineReservation(form: NgForm) {

}

}
