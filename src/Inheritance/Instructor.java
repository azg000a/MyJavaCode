package Inheritance;

import java.util.ArrayList;

public class Instructor extends Person {
	
	private ArrayList<String> subjects;
	
	
	// make constructor, getter/setters, toString
	
	
	
	public Instructor() {
		super();
		this.subjects = new ArrayList<String>();
	}
	
	public Instructor(String firstName, String lastName, String email, String gender, int age) {
		super(firstName, lastName, email, gender, age);
		this.subjects = new ArrayList<String>();
	}
	
	
	
	public ArrayList<String> getSubjects(){
		return subjects;
	}
	
	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
	}
	
	
	
	public void addSubjects(String subject) {
		
		subjects.add(subject);
		
	}
	
	public String toString() {
		
		return "Instructor [" + super.toString() + " -subjects= " + subjects + "]";
	}
	

}
