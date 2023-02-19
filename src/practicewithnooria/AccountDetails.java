package practicewithnooria;

public class AccountDetails extends Bank {
	
	
	private double balance;
	
	
	public AccountDetails() {
		super();
		this.balance = 0;
	}
	
	public AccountDetails(double balance, String firstName, String lastName, String accountNumber) {
		super(firstName, lastName, accountNumber);
		this.balance = balance;
		
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public double deposit(double amount) {
		
		balance+=amount;
		
		return balance;
	}
	
	public double withDraw(double amount) {
		
		balance-=amount;
		
		return balance;
	}
	
	
public String toString() {
	
	return "Account Details: " + super.toString() +"\n" + " Balance: " + balance;
}
	
	
	
	
	

}
