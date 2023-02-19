package basics2;

import java.util.Scanner;

public class LabExample2 {

	public static void main(String[] args) {

		int input = 0;

		Scanner month = new Scanner(System.in);

		System.out.println("What is the month of the year:  ");
		input = month.nextInt();

		if (input >= 0 && input <= 3) {
			System.out.println("It is Spring");
		} else if (input >= 4 && input <= 6) {
			System.out.println("It is Summer");
		} else if (input >= 7 && input <= 9) {
			System.out.println("It is Fall");
		} else if (input >= 10 && input <= 12) {
			System.out.println("It is Winter");
		} else
			System.out.println("Input is wrong");

	}

}
