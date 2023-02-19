package basics2;

import java.util.Scanner;

public class NestedSelection {

	public static void main(String[] args) {

		
		double price = 0;
		double shippingPrice = 0;
		boolean primeMember = 0;		
		
		
//		non-prime member:
//			if price is above 50 shipping price is $10
//			if price is 30- 50 then shipping price is $18
//			if price is 0-30 then shipping price is $25
//		
//		prime members:
//			if price is more than 20 shipping price is free
//		if price is from 0-20 then shipping price is 10% of the price

		Scanner one = new Scanner (System.in);
		System.out.println("Prime Member:  ");
		String input = one.nextLine();
		
		System.out.println("Price:   ");
		double input2 = one.nextDouble();
		
		
		
		if (primeMember == true) {
			if (price > 50) {
				shippingPrice = 10;
				
			}else if ( price >30) {
				shippingPrice = 18;
			}else if ( price > 0) {
				shippingPrice = 25;
			}
			
			
			
			
		}else
			if ( price > 20) {
				shippingPrice = 0;
			}else if ( price <= 20) {
				shippingPrice = price * 0.1;
			}
		
			
		System.out.println("Shipping Price is:  $ " + shippingPrice);
		
		
		
		
		System.out.println("==========================================================");
		System.out.println("==========================================================");
		System.out.println("==========================================================");

		
		
		
		int a = 10;
		int b = 5;
		int c = 15;
		boolean doubleIt = false;
		
		if ( doubleIt == true) {
			if (a * 2 > b)
			
			System.out.println("A double is bigger");
			
			
		}else if ( b * 2 > c) {
			
			System.out.println("B double is bigger");
				
			
		}else if (c * 2 > a) {
			
			System.out.println("C double is bigger");
		}
		
		
		else {
		
		if (a > b) {
			System.out.println("A is bigger than B");
			
		}else if ( b > c) {
			System.out.println("B is bigger than C");
		}else if ( c > a) {
			System.out.println("C is bigger than A");
		}
		
		
		
		
		}
		
		
		
		
		
	}

}
