package interviewQuestions;

public class CombinationOfNumbersInRange {
	
	public static void printNumbers(int start, int end) {
		
		int count = 0;
		
		for(int i = start; i <= end; i++) {
			for (int j = start; j <= end; j ++) {
				for (int k = start; k <= end; k++) {
					System.out.println(i +", "+ j + ", " + k);	
		count ++;			
				}
				
			}
		}
		
		System.out.println("count: " +count);
	}
	
	
	
	
	
	public static void main (String [] args) {
		
		
		
		printNumbers(1,5);
		
	}
	
	

}
