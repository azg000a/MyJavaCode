package basics;

public class ForEachLoop {

	public static void main(String[] args) {

		int[][] arr = { {1, 2}, {3, 4}, {5, 6} };

		for (int[] i : arr) {
			for(int num: i )
			System.out.println(num);
		}
		
		
		

	}

}

