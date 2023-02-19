package oopsAgain;

public class ProceduralToObjectOriented {

	public static void main(String[] args) {

		
		// the following is object oriented:
		// it calls on the Employee class to create the following object from it: 
		// We can use Setters and Getters for data validation:
		
		
		var employee =  new Employee (100_000);
		int wage =	employee.calculateWage();
		System.out.println(wage);
		Employee.printNumberOfEmployees();
		
		
		
		
		
			
		// --> The following is known as Procedural programming and I will convert it into Object Oriented up top:
//		
//		int baseSalary = 50_000;
//		int extraHours = 10;
//		int hourlyRate = 20;
//		int wage =	calculateWage(baseSalary, extraHours, hourlyRate);
		
	}
	// because the main method is static therefore the following method must be static also so we can easily call it in the main method!
		
//	public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {  // this method calculates wage
//				return baseSalary + (extraHours * hourlyRate);
//			
//		}
	
	
	
	
	
	
	
	
	
	
}
