package oopsAgain;

public class BigBankRunner {

	public static void main(String[] args) {

		BigBank user10 = new BigBank("Ahmad ", "Ghafoor ", " 0202214852 ", 15_000);
		BigBank user11 = new BigBank("Hila ", "Ghafoor ", " 022214852 ", 150_000);
		BigBank user12 = new BigBank("Ali ", "Ghafoor ", " 020214852 ", 115_000);
		BigBank user13 = new BigBank("Mina ", "Ghafoor ", " 020224852 ", 415_000);
		BigBank user14 = new BigBank("Abdul ", "Ghafoor ", " 020221452 ", 515_000);

		user10.withdraw(6000);
		user11.withdraw(149_999);
		user12.withdraw(114_000);
		user13.withdraw(410_000);
		user14.withdraw(510_000);

		BigBankInfo branch10 = new BigBankInfo("Alexandria, VA", "Shadgul Jan");

		branch10.addCustomers(user10);
		branch10.addCustomers(user11);
		branch10.addCustomers(user12);
		branch10.addCustomers(user13);
		branch10.addCustomers(user14);

		branch10.printBankInformation();
		user11.withdraw(2);

	}

}
