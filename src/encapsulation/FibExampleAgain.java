package encapsulation;

import java.util.ArrayList;

public class FibExampleAgain {

	// create a method to generate fib numbers
//	1,1,2,3,5,8,13,21,34,55

	public ArrayList<Integer> fibGenerators(int x) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		if (x == 0) {
			return numbers;
		} else if (x == 1) {
			numbers.add(1);
		} else {
			numbers.add(1);
			numbers.add(1);
		}

		for (int index = 2; index < x; index++) {
			int y = numbers.get(index - 1) + numbers.get(index - 2);

			numbers.add(y);

		}

		return numbers;
	}

	public static void main(String[] args) {

		FibExampleAgain user1 = new FibExampleAgain();
		System.out.println(user1.fibGenerators(13));

	}

}
