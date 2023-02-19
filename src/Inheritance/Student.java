package Inheritance;

public class Student extends Person{
	
	private double gpa;
	private String major;
	
	
	public Student() {
		super();
		this.gpa = 0;
		this.major = "";
	}
	
	public Student(String firstName, String lastName, String email, String gender, int age, double gpa, String major) {
		super(firstName, lastName, email, gender, age);
		this.gpa = gpa;
		this.major = major;
	}
	
	
	public double getGPA() {
		return gpa;
	}
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	public String toString() {
		
		return "Student [" + super.toString() + " GPA = " + gpa + " Major: " + major + "]";
		
		
	}
	
	
	
	
	
	
	
	

}
