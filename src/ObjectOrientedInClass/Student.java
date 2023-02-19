package ObjectOrientedInClass;

public class Student {

	// step 1 is to declare variables:
	
	String firstName; 
	String lastName; 
	int age;
	
	// step 2 is to create constructor:
	
	//this is a default constructor:
	
	public Student() { firstName = ""; lastName = ""; age =0; 
	System.out.println("Default Constructor of Student");
	
			}
		
		
	//this is a parameterized constructor:
	
	public Student(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
			
	}
		
		
		
 // method to format students info and print it
	// Access-Modifier Return-Type Identifier: 
	
	
	public void printStudent() {
		
		System.out.println("Student firstName: " + firstName + "lastName: " + lastName + "age is: " + age);
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
}
