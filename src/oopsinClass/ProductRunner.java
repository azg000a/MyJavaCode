package oopsinClass;

public class ProductRunner {

	public static void main(String[] args) {


		Product p1 = new Product("M&M", 5.99, 8);
		Product p2 = new Product("RedBull", 1.89, 12);
		Product p3 = new Product( "Lays", 1.20, 15);
		Product p4 = new Product("Monster", 1.89, 15);
		Product p5 = new Product("Coke", 1.89, 8);
		Product p6 = new Product("Chetoos", 3.75, 3);
		Product p7 = new Product("Water", 2.0, 5);
		Product p8 = new Product("Gatorade", 2.0, 16);
		Product p9 = new Product("Gummies", 2.0, 14);
		Product p10 = new Product("Doritos", 2.0, 11);
		Product p11= new Product("VitaminWater", 2.0, 9);
		Product p12 = new Product("Sprite", 2.0, 15);
		
			
		VendingMachineInClass machine1 = new VendingMachineInClass("Serial12345", 4, 3);
		
		System.out.println(machine1);
		
		
		
		machine1.addItem(p1, 0, 0);
		machine1.addItem(p2, 0, 1);
		machine1.addItem(p3, 0, 2);
		machine1.addItem(p4, 1, 0);
		machine1.addItem(p5, 1, 1);
		machine1.addItem(p6, 1, 2);
		machine1.addItem(p7, 2, 0);
		machine1.addItem(p8, 2, 1);
		machine1.addItem(p9, 2, 2);
		machine1.addItem(p10, 3, 0);
		machine1.addItem(p11, 3, 1);
		machine1.addItem(p12, 3, 2);
	
	}

}
