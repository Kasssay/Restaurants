package pti.sb_restaurants_rest.dto;


import java.time.LocalTime;

public class RestaurantDto {
	
	public int id;
	public String name;
	public LocalTime opening;
	public LocalTime closing;
	
	public RestaurantDto(int id, String name, LocalTime opening, LocalTime closing) {
		super();
		this.id = id;
		this.name = name;
		this.opening = opening;
		this.closing = closing;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalTime getOpening() {
		return opening;
	}

	public void setOpening(LocalTime opening) {
		this.opening = opening;
	}

	public LocalTime getClosing() {
		return closing;
	}

	public void setClosing(LocalTime closing) {
		this.closing = closing;
	}
	
	
	
	
}