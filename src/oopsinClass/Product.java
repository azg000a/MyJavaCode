package oopsinClass;

public class Product {
	
	String name;
	double price;
	int quantity;
	
	
	
	public Product() {
		this.name = "";
		this.price = 0;
		this.quantity = 0;
		
	}
	
	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public String toString() {
		
		return "Product [Name: " + name + ", Price: $" + price + ", Quantity " + quantity + "]";

	}
	
	
	
	
	
	
	
	
	
	
	
}
