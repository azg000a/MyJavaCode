package basics2;

import java.util.Scanner;

public class SwitchLab {

	public static void main(String[] args) {
//
//		String gender = "male";
//		switch (gender) {
//
//		case "female":
//			System.out.println("you are a female");
//			break;
//		case "male":
//			System.out.println("you are a male");
//
//		default:
//			System.out.println(" You are nothing");
//
//		}
//		

		Scanner weeks = new Scanner(System.in);

		System.out.println("Enter the day of the week using a number:  ");
		int day = weeks.nextInt();
weeks.close();




		
		

		switch (day) {

		case 1:
			System.out.println("It is Monday");
			break;		
			
		case 2:
			System.out.println("It is Tuesday");
			break;			
			
		case 3:
			System.out.println("It is Wednesday");
			break;
		case 4:
			System.out.println("It is Thursday");
			break;
		case 5:
			System.out.println("It is Friday");
			break;
		case 6:
			System.out.println("It is Saturday");
			break;
		case 7:
			System.out.println("It is Sunday");
			break;
			default:
				System.out.println("Wrong input");
		}

	

	}

}
