package basics2;

public class MoreSelection {

	public static void main(String[] args) {

	
		String line = "00111102022500";
				
		String code = line.substring(0,3);
		System.out.println("Code is:  "+ code);
		
		String date = line.substring(3,11);
		System.out.println("Date is:  "+ date);
		
		String amount = line.substring(11,14);
		System.out.println("Amount is:  " + amount);
		
		

	}
}