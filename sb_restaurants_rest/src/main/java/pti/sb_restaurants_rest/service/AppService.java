package pti.sb_restaurants_rest.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pti.sb_restaurants_rest.db.ReservationRepository;
import pti.sb_restaurants_rest.db.RestaurantRepository;
import pti.sb_restaurants_rest.dto.RestaurantDto;
import pti.sb_restaurants_rest.model.Restaurant;

@Service
public class AppService {
		
	private  RestaurantRepository restaurantRepo;
	private  ReservationRepository reservationRepo;
	
	@Autowired
	public AppService(RestaurantRepository restaurtanRepo, ReservationRepository reservationRepo) {
		super();
		this.restaurantRepo = restaurtanRepo;
		this.reservationRepo = reservationRepo;
	}
	
	
	public List<RestaurantDto> getRestaurantsFromDb() {
		
		List<RestaurantDto> restaurants = new ArrayList<>();
		
		Iterable<Restaurant>restaurantsIterable = restaurantRepo.findAll();
			
		for(Restaurant restaurant : restaurantsIterable) {
			
			RestaurantDto restaurantDto = new RestaurantDto(
					restaurant.getId(),
					restaurant.getName(),
					restaurant.getOpening(),
					restaurant.getClosing());
			
			restaurants.add(restaurantDto);
		}
		
		return restaurants;
		
	}
	
}
