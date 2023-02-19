package basics2;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {

//		int x = 10;
//
//		while (x >= 0) {
//
//			if (x == 5) {
//				x--;
//				continue;
//			}
//
//			System.out.println(x--);
//		}
//
//		System.out.println("=========================================================");
//
//		while (true) {
//			System.out.println(x++);
//		}
		
		
		
		Scanner obj = new Scanner (System.in);
		
		System.out.println("Enter Number:  ");

		int test = obj.nextInt();
		
		while (test == 123) {
			System.out.println("Cannot use this number order");
			test = obj.nextInt();

			
		}
		
		System.out.println("Number:  " + test);
		
		

	}

}
