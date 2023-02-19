package basics;

public class IfMyPractice {

	public static void main(String[] args) {

//			System.out.println("eligible for discount");
//		} else {
//			System.out.println("not eligible for discount");
//		}

		// if the age is between 18 - 35 and the income is more than 35000
		// 10%
		// if the age is between 36-65 and income is +100,000
		// 5% discount
		// anything else, 0% 
 
		int age = 40;
		double income = 136_000;
		double balance = 1500.50;
		double discountPercentage = 0;

		if (age >= 18 && age <= 35 && income > 35_000) {
			System.out.println("You are eligible for a 10% discount");
			discountPercentage = 0.1;

		}

		else if (age >= 36 && age <= 65 && income > 100_000) {
			System.out.println("You are eligible for a 5% discount");
			discountPercentage = 0.05;
		} 
		
		else {
			System.out.println("You are not eligible for a discount at this time");
			discountPercentage = 0;

		}

		System.out.println("----------------\n");
		System.out.println("Current Balance: " + balance);
		System.out.println("Current Discount: " + (balance * discountPercentage));
		System.out.println("Current Balance after Discount: " + (balance - (balance * discountPercentage)));
	}

}
