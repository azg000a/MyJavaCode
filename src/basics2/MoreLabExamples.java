package basics2;

import java.time.LocalDate;

public class MoreLabExamples {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("Month is:  "+ date.getMonth().name());
		
		
		int month = 11;
		
		switch(month) {
		
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println("Fall");
			break;
			default:
				System.err.println("Wrong Input");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
