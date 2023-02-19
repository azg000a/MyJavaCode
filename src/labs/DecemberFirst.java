package labs;

import java.util.Scanner;

public class DecemberFirst {

	public static void main(String[] args) throws InterruptedException {

			
		int random = (int) (Math.random() *100);
		int input = 0;
			

	
		do {
			
			Scanner number = new Scanner (System.in);
			System.out.println("Pick a number");
			 input = number.nextInt();
			 
			 if(input < random) {
				 System.out.println("Go Higher");
			 }else if (input > random) {
				 System.out.println("Go Lower");
			 }
		} while(input !=random);
		
		System.out.println("Well done you guessed the right number" + input);
		
	
	}
	
	}
