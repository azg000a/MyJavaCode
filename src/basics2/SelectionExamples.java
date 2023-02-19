package basics2;

public class SelectionExamples {

	public static void main(String[] args) {

		
		double age = 24;
		boolean insurance = true;
		double cost = 10589.95;
		double payOutOfPocket = 0;
		double finalBalance = 0;
		
		finalBalance = payOutOfPocket;
		
		if (age >= 35 && age <=50  ) {
			if (insurance) {
				payOutOfPocket = cost * 0.1;

			}
				
			}else {
				payOutOfPocket = cost * 0.85;		

			}

			 
		
		else if (age >= 18 && age <=25) {
			if (insurance) {
				payOutOfPocket = cost * 0.35;

			}	
			}else {
				payOutOfPocket = cost * 0.95;

			}else {
				payOutOfPocket =  cost;
			}
		
			 
			
			
			
			System.out.println("Patient Financial Status Report");
			System.out.println("Age: " + age + " Insurance" + insurance);
			System.out.println("Total Cost:  $" + cost);
			System.out.println("Discounted Amount:  $" + (cost - payOutOfPocket));
			System.out.println("Patient Pay out of Pocket:  $" + payOutOfPocket);
			System.out.println("Final Balance:   $" + finalBalance);

		
		   
	}

}
