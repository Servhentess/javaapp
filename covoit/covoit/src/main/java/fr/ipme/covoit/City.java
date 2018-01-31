package fr.ipme.covoit;

import javax.persistence.*;

@Entity
public class City {
	
	/**
	 * Declaration des variables
	 */
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;

	@OneToOne
	private Trip trip;
	
	/**
	 * constructeur par defaut	
	 */
	public City() {
		super();
	}
	
	/**
	 * Constructeur surcharge	
	 * @param id
	 * @param name
	 */
	public City(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}
}
