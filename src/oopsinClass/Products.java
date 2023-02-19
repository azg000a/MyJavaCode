package oopsinClass;

public class Products {

	String name;
	double price;
	int qty;

	public Products() {
		this.name = "";
		this.price = 0;
		this.qty = 0;

	}

	public Products(String name, double price, int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public String toString() {

		return ("Products [" + "Name: " + name + " Price: $" + price + " Quantity: " + qty + "]");

	}

}
