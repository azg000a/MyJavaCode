package encapsulation;

public class EmployeeInformation {

	private String firstName;
	private String lastName;
	private String id;
	private String department;
	private String email;

	public EmployeeInformation() {
		this.firstName = "";
		this.lastName = "";
		this.id = "";
		this.department = "";
		this.email = "";

	}

	public EmployeeInformation(String firstName, String lastName, String id, String department, String email) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.department = department;
		this.email = email;

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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public String toString() {
		return "Full Name: " + firstName+lastName+ " Id: " + id + " Department: " +department + " Email: " + email;
	}
	
	
	
	
	

}
