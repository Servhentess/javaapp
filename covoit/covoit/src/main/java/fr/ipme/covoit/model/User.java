package fr.ipme.covoit.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
	
	/**
	 * Definition des variables
	 */
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String password;

	@OneToOne
	private Car car;
	@JsonView(User.class)
	@ManyToMany
	private List<Trip> trip;

	/**
	 * Constructeur par defaut
	 */
	public User() {
		super();
	}
	
	/**
	 * Constructeur surcharge
	 * @param id
	 * @param name
	 * @param password
	 */
	public User(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	/**
	 * Getter n Setter
	 */
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public List<Trip> getTrip() {
		return trip;
	}
	public void setTrip(List<Trip> trip) {
		this.trip = trip;
	}
}
