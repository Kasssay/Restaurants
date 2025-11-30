package pti.sb_restaurants_rest.model;

import java.time.LocalTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name="restaurants")
public class Restaurant {
	
	@Id
	@Column(value="id")
	private int id;
	
	@Column(value="name")
	private String name;
	
	@Column(value="capacity")
	private int capacity;
	
	@Column(value="opening")
	private LocalTime opening;
	
	@Column (value="closing")
	private LocalTime closing;

	public Restaurant(int id, String name, int capacity, LocalTime opening, LocalTime closing) {
		super();
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.opening = opening;
		this.closing = closing;
	}

	public Restaurant() {
		super();
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
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
