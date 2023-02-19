package interviewQuestions;

public class EvenOddNumber {
	
	
	
	public static void evenOddNum(int a) {
	
		
		if(a % 2 == 0 ) {
			System.out.println(a+ "  is Even Number");
			
		}else {
			System.out.println(a+ "  is Odd Number");
	
					
		}
		
		
	}
	
	
	
	public static void main(String [] args) {
		
		
		for(int i = 0; i < 100; i ++) {
			evenOddNum(i);
		}
		
		
		
		
	}
	
	
	
	

}
