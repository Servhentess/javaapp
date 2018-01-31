package fr.ipme.covoit;

public class Trip {
	
	/**
	 * Definition des variables
	 */
	private int id;
	private double price;

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
