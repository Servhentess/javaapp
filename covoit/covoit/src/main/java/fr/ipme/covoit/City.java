
public class City {
	
	/**
	 * Declaration des variables
	 */
	private int id;
	private String name;
	
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
