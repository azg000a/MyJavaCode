package basics2;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {

//		String day = "tues";
//		switch (day) {
//
//		case "sat":
//			System.out.println("day is sat");
//			break;
//		case "sun":
//			System.out.println("day is sun");
//			break;
//		case "mon":
//			System.out.println("day is mon");
//			break;
//		case "tues":
//			System.out.println("day is tues");
//			
//		case "wed":
//			System.out.println("day is wed");
//			
//		case "thurs":
//			System.out.println("day is thurs");
//			
//		case "fri":
//			System.out.println("day is fri");
//			
//		default:
//			System.out.println("it is a beautiful day");
//
//		}
//		
		// variables for creating account:

		String firstName = "";
		String lastName = "";
		String userName = "";
		String password = "";
		String email = "";

// 		variables for login:

		String userNameEntered = "";
		String passwordEntered = "";

		Scanner menu = new Scanner(System.in);
		System.out.println("1. Login ");
		System.out.println("2.Create Account");
		int number = menu.nextInt();

		if (number == 1) {
			System.out.println("Login: ");
			System.out.println("Please provide User Name: ");

			userNameEntered = menu.nextLine();

			System.out.println("Please provide Password: ");
			passwordEntered = menu.nextLine();

			if (userNameEntered.equals(userName)) {
				if (passwordEntered.equals(password)) {
					System.out.println("User and Password are both verified");
				} else
					System.out.println("Invalid Password");
			} else {
				System.out.println("Invalid Username");
			}
		} else if (number == 2) {
			System.out.println("Create Account: ");
			System.out.println("Please provide Username: ");
			userName = menu.next();
			System.out.println("Please provide First Name: ");

			firstName = menu.next();
			System.out.println("Please provide Last Name: ");

			lastName = menu.next();
			System.out.println("Please provide Email: ");

			email = menu.next();
			System.out.println("Please provide Password: ");

			password = menu.next();
			System.out.println("Please confirm your Password: ");
			passwordEntered = menu.next();

			if (passwordEntered.equals(password)) {
				System.out.println("Account Created Successfully");
			} else {
				System.out.println("Password does not match!");
				
				
				
			}
			
			
			System.out.println("Login: ");
			System.out.println("Please provide User Name: ");

			userNameEntered = menu.nextLine();

			

			if (userNameEntered.equals(userName)) {
				System.out.println("Please provide Password: ");
				
				passwordEntered = menu.nextLine();
			
				if (passwordEntered.equals(password)) {
					System.out.println("User and Password are both verified");
	
				} else
					System.out.println("Invalid Password");

		} else {
			System.out.println("The number you have entered is not valid");
		}

	}
	}
}
