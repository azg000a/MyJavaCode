package basics2;

import java.util.Scanner;

public class InClassExamples {

	public static void main(String[] args) {

		String userName = "ahmad@tekschool.us";
		String password = "123";

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your username: ");
		String input = sc.next();

		if (userName.equals(input)) {
			System.out.println("Correct Username");
		} else {
			System.out.println("Incorrect Username");
		}
		System.out.println("\n");

		System.out.println("Please enter password: ");
		String input2 = sc.next();

		if (password.equals(input2)) {
			System.out.println("Correct Password");

		} else {
			System.out.println("Incorrect Password");
		}

	}
 
}
    