package oopsinClass;

public class BankAccount {

	String firstName;
	String lastName;
	String phone;
	String email;

	String accountNumber;

	double balance;

	public BankAccount() {
		firstName = "";
		lastName = "";
		phone = "";
		email = "";
		accountNumber = "";
		balance = 0;

	}

	public BankAccount(String firstName, String lastName, String phone, String email, String accountNumber,
			double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.accountNumber = accountNumber;
		this.balance = balance;

	}

	public double checkBalance() {

		System.out.println("Hello! " + firstName + lastName + ", Your current account balance is: $" + balance);
		
		return balance;

	}

	public double deposit(double amount) {
		balance += amount;

		System.out.println("Hello! " + firstName + lastName + " You have successfully made a deposit for: $" + amount
				+ ", Your new balance is: $" + balance);

		return balance;
	}

	public double withdrawl(double amount) {
		double y = balance - amount;
		if (y < 0) {
			System.out.println("Sorry you do not have sufficient funds for this transaction!");
		} else {
			balance -= amount;
			System.out.println("Hello! " + firstName + lastName + " You have successfully made a withdrawl!"
					+ " Your new balance is: $" + balance);

		}

		return balance;
	}
	
	
	
	

}