package oopsAgain;

public class Employee {

	// we are not passing values to the below integers because we will use these integers as templates for later on.
	// In Java we set the fields to private and then use setters and getters to use these integers in other classes. 
	
	private int baseSalary;
	private int hourlyRate;
	
	//this is an example of static field (meaning it represents a single concept):
	
	
	public static int numberOfEmployees;
	
	
	// this is a constructor used to initialize our objects:
	
	public Employee (int baseSalary, int hourlyRate) {
		setBaseSalary (baseSalary);
		setHourlyRate (hourlyRate);
		numberOfEmployees ++;
		
	}
	//this is constructor overloading: we are using the logic in the top constructor and referencing it by using this keyword: 
	public Employee (int baseSalary) {
			this(baseSalary, 0);
	}
	
	// this is a static method :
	
	public static void printNumberOfEmployees() {
		System.out.println("Number of Employee(s): " + numberOfEmployees); // enter the value of the static field here
		
	}
	
	
	// we can pass extraHours into the following method as a parameters because it can always be changing:
	
	public int calculateWage (int extraHours) {
		return baseSalary + (hourlyRate * extraHours);
		
	}
	//this is method overloading; 1 is with parameters and the next one is without parameters:
	public int calculateWage() {
		return baseSalary + (hourlyRate);
	}
	
	
	// this is a setter:
	
	private void setBaseSalary (int baseSalary) {
		if (baseSalary <= 0) 
			throw new IllegalArgumentException("Salary cannot be zero or less");
			
		this.baseSalary = baseSalary;
		
	}
	
	//changed the setters and getters to private to reduce coupling (level of dependency between classes)== this is also known as ABSTRACTION!
	
	
	private int getBaseSalary() {
		return baseSalary;
	}
	
	
	private void setHourlyRate (int hourlyRate) {
		if (hourlyRate < 0)
			throw new IllegalArgumentException ("Hourly rate cannot be zero or lower");
		this.hourlyRate = hourlyRate;
	}
	
	
	private int getHourlyRate() {
		return hourlyRate;
	}
	
	
	
	
	
	
	
}
