package encapsulation;

public class RunnerHere {

public static void main (String [] args) {
	
	
	
	BankAccount account = new BankAccount("Ahmad", "Ghafoor", 30, "1234568", 10_000);
		System.out.println(account.getFirstName());
	
	
	account.setFirstName("Beautiful");
	System.out.println(account.getFirstName());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
