package basics2;

public class UrinaryOperator {

	public static void main(String[] args) {

		double grade = 69;
		String one = "";

		if (grade >= 90) {
			one = grade >=95? "A+" : "A-";

		} else if (grade >= 80) {
			one = grade >=85? "B+" : "B-";
			
		} else if (grade >= 70) {
			one = grade >=75? "C+" : "C-";
			
		} else if (grade >= 60) {
			one = grade >=65? "D+" : "D-";
			
		} else {
			
		one = grade <= 59 ? "F" : "F"; 
		
		}
		
		System.out.println(one);

	}

}
