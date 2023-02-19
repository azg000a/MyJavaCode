package basics2;

import java.util.Random;
import java.util.Scanner;

public class MoreWorkClass {

	public static void main(String[] args) {

		Random rand = new Random();

		int x = rand.nextInt(10);

		// next int will give you a value from 0 to what you put in the parenthesis; you
		// can bump up the range by adding a value to the result!!!!

		int start = 10;
		int end = 20;

		int rest = rand.nextInt(end - start + 1) + 10;

		System.out.println("x =" + start);
		System.out.println("y =" + end);
		System.out.println("z =" + rest);

		System.out.println(
				"=================================================================================================");
		// give me random numbers between 55-75

		int me = rand.nextInt(20) + 56;
		System.out.println(me);

		// 35-50:

		int balloon = rand.nextInt(15) + 36;
		System.out.println("Balloon  = " + balloon);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		int balloon2 = rand.nextInt(50-35 + 1) +35;
		System.out.println("Balloon2 =  " + balloon2);
		
		
		
		
		
		

	}

}
