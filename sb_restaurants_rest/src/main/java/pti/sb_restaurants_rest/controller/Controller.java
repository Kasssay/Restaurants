package pti.sb_restaurants_rest.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pti.sb_restaurants_rest.dto.RestaurantDto;
import pti.sb_restaurants_rest.service.AppService;

@CrossOrigin("*")
@RestController
public class Controller {
	
	private AppService service;

	
	@Autowired
	public Controller(AppService service) {
		super();
		this.service = service;
	}
	

	//http://localhost:8080/restaurants
	@GetMapping("/restaurants")
	public List<RestaurantDto> getRestaurants(){
		
		return service.getRestaurantsFromDb();
		
	}
	
	//http://localhost:8080/date?date=x&&persons=x&&restauran=x
	@GetMapping("/date")
	public List<LocalTime>getFreeTimesByDateAndPersons(
			@RequestParam("date") LocalDate resDate,
			@RequestParam("persons") int resPersons,
			@RequestParam("restaurantId") int restaurantId ){
		
		return service.getFreeTimes(resDate ,resPersons ,restaurantId);
		
			
		
	}
	
	
	
	
}
