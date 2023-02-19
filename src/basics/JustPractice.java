package basics;

import java.util.Scanner;

public class JustPractice {

	public static void main(String[] args) {

		double bill = 15.65;
		double tax = 0;
		double total = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Age:  ");
		Double input = sc.nextDouble();
int age = 70;
		
		
		if (age >= 65) {
			System.out.println("Senior Discount:  ");
			bill *= 0.90;

		} else {
			
		}
		
		
		
		tax = bill * 0.08;
		total = bill + tax;

		System.out.println("Tax:  " + tax);
		System.out.println("\n");
		System.out.println("Total Bill:  " + total);

	}

}