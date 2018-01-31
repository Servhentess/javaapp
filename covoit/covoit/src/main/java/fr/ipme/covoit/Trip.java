package fr.ipme.covoit;

import javax.persistence.*;

@Entity
public class Trip {
	
	/**
	 * Definition des variables
	 */
	@Id
	@GeneratedValue
	private int id;
	@Column
	private double price;

	@OneToOne
	private User user;
	
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
