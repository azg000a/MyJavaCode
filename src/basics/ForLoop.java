package basics;

public class ForLoop {

	public static void main(String[] args) {

		
		String [] words = {"this", "is", "a", "test"};
		
		for( int row = 0; row < words.length; row++) {
			System.out.println(words[row]);
		}
		
		
		
		System.out.println("======================================================");

		
		String [][] words1 = {{"this", "is"}, {"a","test"}      };
		
		for(int row = 0; row < words1.length; row++) {
			for(int col = 0; col< words1[row].length; col++) {
				System.out.println(words1[row][col]);
			}
		}
		
		System.out.println("======================================================");
		System.out.println("======================================================");
		System.out.println("======================================================");

		
		int [][] numbers = {{1,2,3}, {4,5,6},{11,12,18}    };
		
		for( int row = 0; row <numbers.length; row++) {
			for(int col = 0; col < numbers[row].length; col ++) {
				System.out.println(numbers[row][col]);
			}
		}
		
		
	}

}
