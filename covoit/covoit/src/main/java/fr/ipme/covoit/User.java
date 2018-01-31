package fr.ipme.covoit;

public class User {
	
	/**
	 * Definition des variables
	 */
	private int id;
	private String name;
	private String password;
	
	private Car car;

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
}
