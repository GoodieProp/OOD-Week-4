/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: SelectionScreenItem.java
 * 
 * Holds the items of Gucci Menu and Louis Vuitton Menu
 * 
 */
public class SelectionScreenItem {
	// Initialized variables
	String brand;
	String desc;
	boolean ecoFriendly;
	double price;
	
	// Initialized constructor
	public SelectionScreenItem(String brand, String desc, boolean ecoFriendly, double price) {
		this.brand = brand;
		this.desc = desc;
		this.ecoFriendly = ecoFriendly;
		this.price = price;
	}
	
	// gets brand name
	public String getBrand() {
		return brand;
	}
	
	// gets the description
	public String getDesc() {
		return desc;
	}
	
	// true or false if bag is eco friendly
	public boolean isEcoFriendly() {
		return ecoFriendly;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return (brand + ", $" + price + "\n  " + desc);
	}
	
	
}
