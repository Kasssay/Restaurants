package pti.sb_restaurants_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pti.sb_restaurants_rest.dto.RestaurantDto;
import pti.sb_restaurants_rest.service.AppService;

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
	
	
	
}
