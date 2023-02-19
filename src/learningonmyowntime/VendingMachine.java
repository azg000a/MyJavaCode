package learningonmyowntime;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {

		int index = 0;
		System.out.print("Customer please choose an item: " + "1. Doritos " + "2.Fritos " +"3.Lays " + "4.Gatorade");
		Scanner vending = new Scanner(System.in);
		String input = vending.nextLine();
		
		

		String[] items = { "Doritos", "Fritos", "Lays", "Gatorade" };
		double[] price = { 1.99, 2.99, 3.99, 4.99 };
		
		int[] quantity = { 5, 10, 15, 20 };
		
			for(int x = 0;x<quantity.length;x++)
				{  

					System.out.println(items[x] + ", $" + price[x] + ", " + quantity[x]);

				}
		if (input.equals("Doritos")) {
				 index = 0;
				quantity[index]=quantity[index] -1;
				
		}
		else if(input.equals("Fritos")) {
				 index = 1;
				quantity[index]=quantity[index] -1;
				
		}
		else if(input.equals("Lays")) {

				 index = 2;
				quantity[index]=quantity[index] -1;
		}		
		else if(input.equals("Gatorade")) {
				 index = 3;
				quantity[index]=quantity[index] -1;
		}
		
	
	System.out.println("You have entered " + input);
	
	System.out.println("The new updated quantity for " +input + " is " + quantity[index]);
}}
