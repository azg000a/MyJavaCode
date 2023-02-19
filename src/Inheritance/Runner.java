package Inheritance;

public class Runner {

	public static void main(String[] args) {

		
		
		
		Employee user = new Employee("@323@", "Chem", "Shad", "Gul", "ShadGul@gmail.com", "F", 49);
		
		
		
		
		Instructor user2 = new Instructor("ahmad", "ghafoor", "ahmad@gmail.com", "Male", 32);
		user2.addSubjects("JAVA");
		user2.addSubjects("Chem");
		user2.addSubjects("C#");
		user2.addSubjects("Python");
		System.out.println(user2);
		
		Student user3 = new Student("Zia", "Ghafoor", "e@gmail.com", "Male", 32, 3.95, "Chemistry");
		System.out.println(user3);
		
		
		
		
		System.out.println("====================================");
		
		
		String x = "testing";
		
		System.out.println(x.toUpperCase());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
