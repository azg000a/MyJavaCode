package basics;

public class SelectionBasic {

	public static void main(String[] args) {

		// short circuit operators
		// && and
		// || or
		// ! not

		int age = 37;
		double income = 110000;
		double balance = 1257.89;
		double discountPercentage = 0;
//		if(age >= 20) {
//			System.out.println("eligible for discount");
//		} else {
//			System.out.println("not eligible for discount");
//		}

		// if the age is between 18 - 35 and the income is more than 35000
		// 10%
		// if the age is between 36-65 and income is +100,000
		// 5% discount
		// anything else, 0%

		if (age >= 18 && age <= 35 && income > 35000) {
			System.out.println("give them 10%");
			discountPercentage = 0.1;
		} else if (age >= 36 && age <= 65 && income > 100000) {
			System.out.println("give them 5%");
			discountPercentage = 0.05;
		} else {
			System.out.println("give them 0%");
			discountPercentage = 0;
		}

		System.out.println("Current balance is " + balance);
		System.out.println("current discount is " + (balance * discountPercentage));
		System.out.println("balance after discount " + (balance - (balance * discountPercentage)));

	}

}
