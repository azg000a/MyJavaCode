package basics2;

import java.util.Random;
import java.util.Scanner;

public class InClassArray {

	public static void main(String[] args) {

//		int [] numbers = new int [5];
//		
//		numbers [0] = 10;
//		numbers [1] = 200;
//		numbers [2] = 30;
//		numbers [3] = 40;
//		numbers [4] = 5;
//		
//		
//		int result1 =  numbers[0] + numbers [1];
//		int result2 = numbers[2] + numbers [3];
//		
//				
//		System.out.println ( numbers [0] +"\n" + numbers [1] +"\n" + numbers [2] +"\n" + numbers [3] +"\n" + numbers [4]);
//		
//		
//		System.out.println("Sum of Indexes 0 and 1: " + numbers[0] + numbers [1]);
//		
//		System.out.println("Sum of Indexes 2 and 3: " + numbers[2] + numbers [3]);
//		
//		
//		System.out.println("Sum Divided: " + result1/numbers[4]* result2);
//
//		
//		
//		
//		
//		
//		System.out.println("==============================================================================" + "\n" + "====================================");
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		int [] nums = new int[10];
//		String str = "This is a test String";
//		String [] words = str.split(" ");
//		
//		
//		int index = 0;
//		while (index < words.length) {
//			System.out.println(index + "   " + words[index]);
//			index ++;
//			
//		}
//		
		
		
//		
//		
//		String password = "Shadgul";
//		
//		Scanner pass = new Scanner (System.in);
//		System.out.println("Enter Password: ");
//		String test = pass.next();
//		
//		while (test.equals(password)==false) {
//			System.out.println("Please enter the correct password");
//			 test = pass.next();
//		}
//		System.out.println("Correct Password");
//		
//		
//		
		int start = 10;
		int end = 100;
		
		Random rand = new Random();
		
		
//		int x = rand.nextInt(end-start + 1) + start;
//		boolean guessed = false;
//		
//		Scanner number = new Scanner (System.in);
//		System.out.println("Please enter a random number: ");
//		int input = number.nextInt();
//		
//		
//		
//		while (guessed == false) {
//			System.out.println("Enter a new number");
//			input = number.nextInt();
//		
//		if( input > x) {
//			System.out.println("Pick a lower number");
//		}else if (input < x) {
//			System.out.println("Pick a higher number");
//		}else {
//			System.out.println("You have guessed the right number, " + input);
//			guessed = true;
//		}
//		
//		}
//		System.out.println("Thanks for playing, try again!");
		
		
		
		int start1 = 10;
		int end1 = 100;
		int expectedAmount = 20;
		int count = 0;
		int [] numbers = new int [expectedAmount];
		int iterationCount = 0;
		
		while(count < expectedAmount ) {
			int r = rand.nextInt(end-start + 1) + start;
			if(r % 2 != 0) {
				numbers[count] = r;
				
				System.out.println((count + 1) + "." + r);
				count++;
			}
			iterationCount++;
		}
		System.out.println("It took " + iterationCount + " to find all "  + expectedAmount );
		System.out.println("============================== Print the Array");
		
		int i = 0;
		while (i < numbers.length) {
			System.out.println((i + 1) + "." + numbers[i]);

			i++;
		}
		
		
		
	}

}
