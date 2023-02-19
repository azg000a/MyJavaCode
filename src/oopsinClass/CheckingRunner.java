package oopsinClass;

import java.util.Scanner;

public class CheckingRunner {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
	    System.out.println("Please enter your first name");
	    String firstName = input.nextLine();

	    System.out.println("Please enter your last name");
	    String lastName = input.next();
	    
	    Checking1 name = new Checking1();
	    
	    name.printFullName("Ahmad", "Ghafoor");
		
		
		
	}

}
