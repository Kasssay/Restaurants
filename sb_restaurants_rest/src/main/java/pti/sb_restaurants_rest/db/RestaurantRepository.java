package pti.sb_restaurants_rest.db;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pti.sb_restaurants_rest.model.Restaurant;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant,Integer> {
	
}
