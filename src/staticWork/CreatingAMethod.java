package staticWork;

public class CreatingAMethod {

	
		
		public static int pow (int number, int power) {
			
			int res = 1;
			for (int i = 0; i < power; i++) {
				res*=number;
			}
			
			return res;
		}
	
		
		
		
		public static void main (String [] args) {
			System.out.println("Math method:  " + Math.pow(10, 3));
			

			System.out.println(pow(10,3));
		}
		

}
