package fr.ipme.covoit;

import javax.persistence.*;

@Entity
public class Car {
	
	/**
	 * Definition des variables
	 */
	@Id
    @GeneratedValue
	private int id;
	@Column
	private String model;
	@Column
	private int nbrDePlace;

	@OneToOne
	private Trip trip;
    @Transient
	private Brand brand;

    /**
     * blaaaaaaaaaaaaaaaaaaa
     */

    /**
	 * Constructeur par defaut
	 */
	public Car() {
		super();
	}
	
	/**
	 * Constructeur surcharge
	 */
	public Car(int id, String model, int nbrDePlace) {
		super();
		this.id = id;
		this.model = model;
		this.nbrDePlace = nbrDePlace;
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
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNbrDePlace() {
		return nbrDePlace;
	}
	public void setNbrDePlace(int nbrDePlace) {
		this.nbrDePlace = nbrDePlace;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}	
}
