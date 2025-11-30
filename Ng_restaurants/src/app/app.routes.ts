import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RestaurantComponent } from './restaurant-component/restaurant-component';
import { AddressComponent } from './address-component/address-component';
import { DateComponent } from './date-component/date-component';

export const routes: Routes = [ 
     {path: '', component: RestaurantComponent},
     {path: 'reservation/address' , component: AddressComponent },
     {path: 'reservation/date' , component: DateComponent}
];


@NgModule({
imports: [RouterModule.forRoot(routes)],
exports: [RouterModule]
})
export class AppRoutingModul {}
