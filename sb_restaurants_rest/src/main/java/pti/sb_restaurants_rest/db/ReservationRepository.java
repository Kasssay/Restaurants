package pti.sb_restaurants_rest.db;



import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pti.sb_restaurants_rest.model.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Integer> {

	@Query("SELECT * FROM reservations WHERE date = :resDate ORDER BY time")
	public List<Reservation> getReservationsByDate(@Param("resDate")LocalDate date );
	
}