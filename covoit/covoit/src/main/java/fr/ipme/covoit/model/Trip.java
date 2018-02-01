package fr.ipme.covoit.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Trip {
	
	/**
	 * Definition des variables
	 */
	@Id
	@GeneratedValue
	private int id;
	@Column
	private double price;

	@JsonView(Trip.class)
	@ManyToMany
	private List<User> user;
	
	/**
	 * Constructeur par defaut	
	 */
	public Trip() {
		super();
	}
	
	/**
	 * Constructeur surcharge
	 * @param id
	 * @param price
	 */
	public Trip(int id, double price) {
		super();
		this.id = id;
		this.price = price;
	}


	/**
	 * Getter n Setter
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
}
