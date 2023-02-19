package interviewQuestions;

public class MethodSumWithLogics {

	
	public int freedomSum(int a, int b, int c) {
		
		if(a == 10) {
			return 0;
		}else if(b == 10) {
			return a;
		}else if(c == 10) {
			return a+b;
		}else {
		
		return a+b+c;
		}
		}
	
	
	
	
	
	
	
	public int freedomSum2(int a, int b, int c) {
		
		if (a == 10) {
			return 0;
		} else if(b == 10) {
			return a;
		} else if (c == 10) {
			return a +b;
		}
		
		return a+b+c;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

public static void main(String [] args) {
	
	MethodSumWithLogics obj = new MethodSumWithLogics();
	
	System.out.println(obj.freedomSum(1, 1, 10));
	
	
	
	
	
	
	System.out.println(obj.freedomSum2(11, 1, 10));
}














}
