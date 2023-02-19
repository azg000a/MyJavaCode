package oopsinClass;

public class VendingProducts {
	
	// name, price and quantity
	
	
	String name;
	double price;
	int quantity;
	
	
	public VendingProducts() {
		this.name = "";
		this.price = 0;
		this.quantity = 0;
	}
	
	public VendingProducts(String name, double price, int quantity) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
		
	}
	
	public String toString() {
		return ("[" + "Name: " + name + "|  " + "Price: $" + price +"|  " + "Quantity: " + quantity + "]");
	}
	
	

}
