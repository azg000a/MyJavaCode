package basics;

public class SplitString {

	public static void main(String[] args) {

		
		String str = "This is a test String";
		
		String [] words = str.split(" ");
		
		for(String x : words) {
			System.out.println(x);
		}
		
		
		System.out.println("======================================================");
		
		String [] words1 = {"This", "is", "a", "test"};
		for(String x : words1) {
			System.out.println(x);
		}
		
		
		
		System.out.println("======================================================");

		
		
		
		
		int [][] nums = {{1,2}, {3,4}, {5,6}    };
		for(int []x : nums) {
			for (int y: x) {
				System.out.print(y + ", ");
			}
		}
		
		
	}

}
