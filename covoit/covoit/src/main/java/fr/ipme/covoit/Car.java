
public class Car {
	
	/**
	 * Definition des variables
	 */
	private int id;
	private String model;
	private int nbrDePlace;
	
	private Trip trip;
	private Brand brand;
	
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
