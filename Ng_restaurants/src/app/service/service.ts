import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class Service {

  private restaurantId: number | null;
  private guestName: string | null;
  private guestPhone : number | null;

  public constructor(){
    this.restaurantId = null;
    this.guestName = null;
    this.guestPhone = null;
  }

  public setRestaurantId(id : number){
    this.restaurantId = id;
  }

  public getRestaurantId(): number | null{
    return this.restaurantId;
  }

  public setGuestName(name:string){
    this.guestName = name;
  }

  public getGuestName(){
    return this.guestName;
  }

  public setGuestPhone(phoneNumber : number){
    this.guestPhone = phoneNumber;
  }

  public getGuestPhone(){
    return this.getGuestPhone;
  }
  
}
