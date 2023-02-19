package oopsinClass;

import java.util.ArrayList;

public class Instructor extends Person{
	
	private ArrayList <String> subjects;
	
	
	public Instructor() {
		super();
		subjects  = new ArrayList<String>();
		
		
	}
	
	public ArrayList<String> getSubjects() {
		return subjects;
	}
	
	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
		
	}
	
	
	public String toString() {
		return "Instructor [" + super.toSring() + " - subjects""
	}
	
	
	
	

}
