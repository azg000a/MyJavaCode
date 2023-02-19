package interviewQuestions;

public class RemoveSpecialCharacters {
	
	public static void main (String [] args) {
		
		
		
		String text = "This is $%$ a #@#$# beaut@iful@ d@@ay!!  9898989";
		
		
		
		
		
		String [] arr = text.split("[^a-zA-Z ]");
		for (int i = 0; i <arr.length; i ++) {
			System.out.print(arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
