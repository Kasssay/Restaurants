package pti.sb_restaurants_rest.service;



import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pti.sb_restaurants_rest.db.ReservationRepository;
import pti.sb_restaurants_rest.db.RestaurantRepository;
import pti.sb_restaurants_rest.dto.RestaurantDto;
import pti.sb_restaurants_rest.model.Reservation;
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


	public List<LocalTime> getFreeTimes(LocalDate resDate, int resPersons, int restaurantId) {
		
		//Feltöltsük ezt a listát a nap 24 orájával majd kivonjuk belőle azokat az időket amikor már nem lehet foglalni.
		List<LocalTime> freetimes = new ArrayList<>();
		

		Restaurant restaurant = null;
		Integer restaurantCapacity = null;
		
		//0 generate day hours
		
		for(int index = 0; index < 24; index++ ) {
			
			freetimes.add(LocalTime.of(index, 00));
		}
		
		
		
		//1 find restaurant
		Optional<Restaurant> restaurantOpt = restaurantRepo.findById(restaurantId);
		
		if(restaurantOpt.isPresent()) {
			
			restaurant = restaurantOpt.get();
			restaurantCapacity = restaurant.getCapacity();
	
		}
		
		//2 delete close times
		
		LocalTime opening = restaurant.getOpening();
		
		for(int index = 0; index <= opening.getHour(); index++) {
			
			freetimes.remove(index);
			
		}
		
		LocalTime closeing = restaurant.getClosing();
		
		for(int index = freetimes.size(); index >= closeing.getHour(); index++) {
					
					freetimes.remove(index);
					
				}
			

		//3 find all reservation
		
		
		List<LocalTime> reservedTimes = new ArrayList<>();
		
		List<Reservation> reservations = reservationRepo.getReservationsByDate(resDate);
		
		if(reservations.size() > 0 ) {
			
			for(Reservation reservation : reservations){
				
				
				
				
				
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		return freetimes;
	}
	
}
