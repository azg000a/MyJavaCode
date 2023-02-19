package practicewithnooria;

public class BankRunner {
	
	public static void main(String [] args) {
		
		
		Bank user = new Bank("Ahmad", "Ghafoor", "123456");
		
//		System.out.println(user.getFirstName());
//	
//		user.setFirstName("Zia");
//		
//		System.out.println(user.getFirstName());
//		
//		user.printBank();

	
	
	
	AccountDetails user1 = new AccountDetails(10_000, "Ahmad", "Ghafoor", "123456");
	
System.out.println(user1.getBalance());



user1.deposit(5000);

System.out.println(user1.getBalance());
	

user1.withDraw(10000);

System.out.println(user1.getBalance());


System.out.println(user1.toString());
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
