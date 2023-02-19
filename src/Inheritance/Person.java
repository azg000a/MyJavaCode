package Inheritance;

public class Person {
	
	// to create inheritance then use the keyword    extends   
	// one class can only have 1 parent and many child classes
	// you inherit all the variables and methods of the parent class but not constructors(you can call constructors if needed)..
	// you have to create constructors for each class
	// this keyword refers to the scope of the current class
	// super keyword refers to the scope of the parent class
	
	// constructor chaining must happen on the first statement on your constructor
	// for chaining use this or super keywords and then match the signature(s)
	
	
	
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private int age;
	
	
	
	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.email = "";
		this.gender = "";
		this.age= 0;
	}
	
	public Person(String firstName, String lastName, String email, String gender, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	
	
	
	public String getFirstName () {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
	
	
	public String toString() {
		return "First Name: " + firstName + " Last Name: " + lastName + " Email: " + email + " Gender: " + gender + " Age: "+ age;
	}
	
	
	
	
	
	
	
	
	
	
	

}
