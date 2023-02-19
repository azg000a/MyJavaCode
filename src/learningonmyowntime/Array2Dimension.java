package learningonmyowntime;

public class Array2Dimension {

	public static void main(String[] args) {

		
		double sum = 0;
		int count = 0;
		int [][] numbers = { {83,12,72}, {54,88,51}, {61,90,32}, {14,49,26}, {39,76,84}, {41,42,5} };
		
			for ( int i = 0; i < numbers.length; i++) {
				for (int k = 0; k < numbers[i].length; k++) {
					System.out.print(numbers[i][k] + " ");
			//		sum+= numbers[i][k];						//this line and the line after it, mean the same thing!
					sum = sum+numbers[i][k];
					count ++;									// count is the amount of numbers we have; in this case it is 18. **count each number*
					
				}
			//	count+=numbers[i].length;			// notice how you can measure the count 2 different ways! *this one after inner loop is closed*
				
				System.out.println();
			}
			System.out.println("The sum is: " + sum);
			System.out.println("The count is: " + count);
			System.out.println("The avg is: " + (sum/count));
			
			
			System.out.println("==================================================");
			System.out.println("==================================================");
			System.out.println("==================================================");	
		System.out.println("==================================================");	
		
	
	int n = 1;
		for(int i = 0; i <3; i++) {
			for(int j = 0; j< 4; j++) {
				if ( n < 10) {
					System.out.print("0");
				}
			
				System.out.print(n++ + "\t");
			}
			System.out.println();
		}
		
		
		
		System.out.println("==================================================");
		System.out.println("==================================================");
		System.out.println("==================================================");
		
	
		int counter = 0;
		
		for ( int i = 0; i < 5; i++) {
			for (int k = 0; k < 3; k++) {
				if( (i+k) % 2 ==0) {
					System.out.println("The sum of: " + i + "+" + k +" = "+ (i+k) +" is even");
				}else {
					System.out.println("The sum of: " + i + "+" + k + " = "+ (i+k) + " is odd");
				}
				
			}
			System.out.println();
		}
		
	

		System.out.println("==================================================");
		System.out.println("==================================================");
		System.out.println("==================================================");
		
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i ==5) {						// this ends the code at number 5
				break;
			}
		}
		
		System.out.println("=====================================");

		for (int i = 0; i < 10; i++) {
			if (i ==5) {
				continue;
			}
			System.out.println(i);         //this skips the number 5  ***notice how sysout is after continue. 

		}
		
		
		
		
		
		System.out.println("=============================================================");
		
	x:	for (int i = 0; i < 5; i++) {
		y:	for(int j = 0; j < 10; j++) {								// this is how you label for loops and select which to break*****
				if(j == 4) {
					break y;
				}
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	
	
	
	
		
	}
	
}
		
		
		
		
		
		

