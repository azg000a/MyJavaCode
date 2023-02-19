package oopsAgain;

import java.util.ArrayList;

public class BigBank {

	String firstName;
	String lastName;
	String accountNumber;
	double balance;

	public BigBank() {
		this.firstName = "";
		this.lastName = "";
		String accountNumber = "";
		double balance = 0;
	}

	public BigBank(String firstName, String lastName, String accountNumber, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.balance = balance;

	}

	public double deposit(double amount) {
		balance += amount;
		System.out.println("Your new balance is: $" + balance);

		return balance;
	}

	public double withdraw(double amount) {
		double y = balance - amount;
		if (y <= 0) {
			System.out.println("You do not have sufficient funds for this transaction!");
		} else {
			balance -= amount;
			System.out.println("Your new balance is: $" + balance);
		}

		return balance;
	}

	public void checkBalance() {
		System.out.println("Your current balance is: $" + balance);
	}

}
