package oopsinClass;

public class BankAccountt {

	private String firstName;
	private String lastName;
	private int age;
	
	
	private String accountNumber;
	private double balance;
	
	public BankAccountt() {
		
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		this.accountNumber = "";
		this.balance = 0;
		
	}
	
	public BankAccountt(String firstName, String lastName, int age, String accountNumber, double balance) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.accountNumber = accountNumber;
		this.balance = balance;
			
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public void setfirstName (String firstName) {
		this.firstName = firstName;
	}
	
	
	
	
	
	
	
	
}
