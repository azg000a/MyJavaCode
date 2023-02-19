package oops;

public class Student extends Person {

	String major;
	double gpa;

	// this is without parameters:

	public Student() {
		super();
		super.firstName = firstName;
		super.lastName = lastName;
		super.age = 0;
		System.out.println("Object of Student was Created!");
	}

	// this is with parameters:

	public Student(String firstName, String lastName) {
		this();
		super.firstName = firstName;
		super.lastName = lastName;

	}

	public Student(String firstName, String lastName, double age) {
		super.firstName = firstName;
		super.lastName = lastName;
		this.gpa = age;

	}

	 public void printSomething() {
		System.out.println("this is a test");
	}

	public int sum(int a, int b) {
		return a + b;
		
		
		
			}

	
	@Override
	public String toString() {
		return "Student [firstName: " + super.firstName + ", lastName: " + super.lastName + ", age: " + super.age + "]";
	}
	
	
}
