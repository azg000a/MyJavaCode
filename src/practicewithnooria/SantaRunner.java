package practicewithnooria;

public class SantaRunner {
	
	public static void main (String [] args) {
		
		SantaList lists = new SantaList();
		
		
		Gift user = new Gift();
		Gift user2 = new Gift();
		
		Person name = new Person("Ahmad", "VA", 22);
		Person name2 = new Person ("Nooria", "VA", 20);
		user.setCookies(20);
		System.out.println("Cookies Amount: " + user.getCookies());
		lists.addGift(user);
		user.cookieTotal(5);
		lists.addPerson(name);
		
		System.out.println("Give " + name + " a gift of 5 cookies" + " and the remaining balance of cookies is " + user.getCookies() );
		
		
SantaList obj = new SantaList();
System.out.println(obj.addToys());

		
	}
	
	
	
	
	

}
