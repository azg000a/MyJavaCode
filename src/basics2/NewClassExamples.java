package basics2;

import java.util.Scanner;

public class NewClassExamples {

	public static void main(String[] args) {
		
		// enter each word
		// then system reads out which is bigger
		
		

		String firstName = "Jack";
		String lastName = "Davidson";

		if (firstName.length() > lastName.length()) {

			System.out.println("firstName is bigger");

		} else {

			System.out.println("lastName is bigger");
		}
		
		
		System.out.println("==============================================================================");
		
		
//		
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Word 1:   ");
//		String firstName1 = sc.nextLine();
//		
//		System.out.println("Word 2:   ");
//		String lastName2 = sc.nextLine();
//		
//		
//		if (firstName1.length() > lastName2.length()) {
//
//			System.out.println("Word 1 is bigger");
//
//		} else {
//
//			System.out.println("Word 2 is bigger");
//		}
		
		
		
		String str = "jaCK";
		
		String firstChar = "" + str.charAt(0);
		
		String firstChar2 = firstChar.toUpperCase();
		
		String attachString = str.substring(1).toLowerCase();
		
		System.out.println( firstChar2 + attachString);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
