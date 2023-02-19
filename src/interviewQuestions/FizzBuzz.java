package interviewQuestions;

public class FizzBuzz {
	
	// function that runs from 1 - 100
	// if divisible by 3 then print Fizz
	// if divisible by 5 then print Buzz
	// if divisible by 3 and 5 then print FizzBuzz
	
	
	
	
	
	public static void fizzBuzz(int n) {
		
		if (n % 3 == 0 && n % 5 == 0) {
			System.out.println("FizzBuzz");
		}
		else if (n % 3 == 0) {
			System.out.println("Fizz");
		}else if(n % 5 == 0) {
			System.out.println("Buzz");
		}
		
		
	}
	
	
	public static void main(String []args) {
		
		
		fizzBuzz(15  );
		
		
		
		
	}
	
	

}
