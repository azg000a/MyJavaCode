package basics2;

import java.util.Scanner;

public class ClassArrays2Dimension {

	public static void main(String[] args) {

		String[] names = { "Ahmad", "Ghafoor", "Blah", "Doh" };

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "  ");
		}

		System.out.println();

		for (String x : names) {
			System.out.print(x + " ");
		}

		System.out.println();

		String[][] chars = { { "a", "b", "c" }, { "d", "e" }, { "f", "g", "h" } };
		for (String[] some : chars) {
			for (String col : some) {
				System.out.print(col + " ");

			}
			System.out.println();
		}

		System.out.println("================================");

		String[] country = { "USA", "Afghanistan", "Canada", "Brazil", "England" };
		for (int i = 0; i < country.length; i++) {
			System.out.print(country[i] + "  ");

		}
		System.out.println("==================");

		String[] countries = { "USA", "Afghanistan", "Canada", "Brazil", "England" };
		for (int b = countries.length - 1; b >= 0; b--) { // this is how you reverse a String!
			System.out.print(countries[b] + "     ");
		}
		System.out.println("\n");

		int sum = 0;
		int sumEven = 0;
		int sumOdd = 0;

		int[][] nums = { { 22, 14, 15, 25 }, { 30, 14, 55, 109 }, { 44, 40, 51, 63 }, { 1, 7, 9 } };

		for (int[] n : nums) {
			for (int x : n) {
				System.out.print(x + "  ");
				sum += x;
				if (x % 2 == 0) {
					sumEven += x;

				} else {
					sumOdd += x;
				}
			}
			System.out.println();
		}
		System.out.println("The sum is : " + sum);
		System.out.println("sumEven " + sumEven);
		System.out.println("sumOdd " + sumOdd);

		System.out.println(sumEven > sumOdd ? "Sum Even is larger" : "Sum Odd is larger");

		System.out.println("======================================================");
		
		
		
		

		String[] city = { "Richmond", "Sydney", "Dubai", "Hartford", "123" };

		for (int i = 0; i < city.length; i++) {

			if (city[i].startsWith("H")) {

				System.out.println(city[i]);
			}

		}
		System.out.println();
		
		
		System.out.println("================================================================================");
		System.out.println("================================================================================");
		
		String [] nothing = {"Cars", "Boats", "Trucks", "Planes"};
		
		for (int i = 0; i < nothing.length; i ++) {
			System.out.print(nothing[i] + " ");
		}
		System.out.println();
		
		for ( int i = nothing.length -1; i >=0; i--) {
			System.out.print(nothing[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("======================================================================================");
		System.out.println("======================================================================================");
		System.out.println();
		
		
		int sum2 = 0;
		int sumEven2 = 0;
		int sumOdd2 = 0;
		int count = 0;
		int [][] kits = { {2,3,4 }, {5,6,7 }, {8,9,10 }, {11,12,13,15 }, {25,35,45,55,185} };
		
		for(int [] i : kits) {
			for (int k : i) {
				System.out.print(k + " ");
				sum2+=k;
				if( k % 2 ==0) {
					sumEven2 +=k;
				}else {
					sumOdd2 +=k;
				}
				count ++;
			}
			
		}
		
		System.out.println("\n");
		System.out.println("sumEven2 is: " + sumEven2);
		System.out.println("sumOdd2 is: " + sumOdd2);
		System.out.println(sumEven2 > sumOdd2 ? "sumEven 2 is larger" : "sumOdd2 is larger");
		System.out.println("The sum is: " + sum2);
		System.out.println("The total count is: " + count);
		System.out.println("The average is: " + (sum2/count));
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
