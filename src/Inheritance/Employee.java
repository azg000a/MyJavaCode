package Inheritance;

public class Employee extends Person{

	
	private String id;
	private String department;
	

	public Employee() {
		
		super();
		this.id = "";
		this.department = "";

	}

	public Employee(String id, String department) {

		this();      // this chains the default constructor above and initializes all variables
		
		this.id = id;
		this.department = department;

	}
	
	
	
	
	
	public Employee(String id, String department,String firstName, String lastName, String email, String gender, int age) {

		super(firstName, lastName, email, gender, age);  // this chains the parent class parameterized constructor
		this.id = id;
		this.department = department;

	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	public String toString() {
		
		return "Employee [" + super.toString() + "ID: " + id + "Department: " + department  +"]";
	}
	

}
