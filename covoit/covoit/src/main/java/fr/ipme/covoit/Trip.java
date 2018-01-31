
public class Trip {
	
	/**
	 * Definition des variables
	 */
	private int id;
	private double price;
	
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
}
