package oopsinClass;

public class BankRunner {

	public static void main(String[] args) {

		BankAccount user1 = new BankAccount("Ahmad ", " Ghafoor", "2025717030", " ahmadghafoor@tekschool.us",
				"0202214852", 625.25);

//			user1.checkBalance();
//			user1.deposit(25.25);
//			user1.withdrawl(300);
//			user1.checkBalance();
//			user1.withdrawl(400);
//			
//			
			
			Bank branch1 = new Bank("Some Address", "Manager Name");
			
			branch1.addCustomer(user1);
			branch1.addCustomer(user1);
			branch1.addCustomer(user1);
			branch1.addCustomer(user1);
			branch1.addCustomer(user1);
			branch1.addCustomer(user1);
			branch1.addCustomer(user1);
			branch1.addCustomer(user1);
			branch1.addCustomer(user1);
			branch1.addCustomer(user1);
			branch1.addCustomer(user1);

			
			branch1.printBankInfo();
	}
}