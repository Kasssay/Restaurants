package pti.sb_restaurants_rest.model;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name="reservations")
public class Reservation {

	@Id
	@Column(value="id")
	private int id;
	
	@Column(value="restaurant_id")
	private int restaurantId;
	
	@Column(value="persons")
	private int persons;
	
	@Column(value="date")
	private LocalDate date;
	
	@Column(value="time")
	private LocalTime time;
	
	@Column(value="quest_name")
	private String questName;
	
	@Column(value="quest_phone")
	private int questPhone;

	public Reservation(int id, int restaurantId, int persons, LocalDate date, LocalTime time, String questName,
			int questPhone) {
		super();
		this.id = id;
		this.restaurantId = restaurantId;
		this.persons = persons;
		this.date = date;
		this.time = time;
		this.questName = questName;
		this.questPhone = questPhone;
	}

	public Reservation() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public int getPersons() {
		return persons;
	}

	public void setPersons(int persons) {
		this.persons = persons;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String getQuestName() {
		return questName;
	}

	public void setQuestName(String questName) {
		this.questName = questName;
	}

	public int getQuestPhone() {
		return questPhone;
	}

	public void setQuestPhone(int questPhone) {
		this.questPhone = questPhone;
	}
	
	
}
