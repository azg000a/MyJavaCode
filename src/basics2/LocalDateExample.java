package basics2;

import java.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {

		
		
		
		LocalDate todayDate = LocalDate.now();
		System.out.println(todayDate.getYear());
		System.out.println(todayDate.getMonth());
		System.out.println(todayDate.getDayOfWeek().getValue());
		
		int day = todayDate.getDayOfWeek().getValue();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
