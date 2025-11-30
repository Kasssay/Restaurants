package pti.sb_restaurants_rest.db;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pti.sb_restaurants_rest.model.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Integer> {

}
