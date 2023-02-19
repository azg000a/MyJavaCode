package practicewithnooria;

public class Bank {

	private String firstName;
	private String lastName;
	private String accountNumber;

	public Bank() {
		super();
		this.firstName = "";
		this.lastName = "";
		this.accountNumber = "";

	}

	public Bank(String firstName, String lastName, String accountNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void printBank() {
		System.out.println("Account Holder First Name: " + firstName);
		System.out.println("Account Holder Last Name : " + lastName);
		System.out.println("Account number: " + accountNumber);

	}
	
	@Override
	public String toString() {
		return "Account Holder First Name: " + firstName + "\n" + "Account Holder Last Name: " + lastName + "\n" + "Account Number: " + accountNumber;
		
	}
	
	
	
	
	

}
