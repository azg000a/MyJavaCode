package oopsinClass;

public class VendingRunner {

	public static void main(String[] args) {

		
		VendingProducts product1 = new VendingProducts("Lays", 1.99, 10);
		VendingProducts product2 = new VendingProducts("Doritos", 1.59, 20);
		VendingProducts product3 = new VendingProducts("Water", 0.99, 50);
		
			System.out.println(product1);
	
			
			
			
			VendingAgain obj1 = new VendingAgain("machine1234", 4, 3);
			obj1.addItems(product1, 0, 0);
			obj1.addItems(product2, 0, 1);
			obj1.addItems(product3, 0, 2);
			
			
			obj1.purchase(0, 0);
			
			System.out.println(obj1);
		
			
	}

}
