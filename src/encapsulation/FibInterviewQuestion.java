package encapsulation;

import java.util.ArrayList;

public class FibInterviewQuestion {
	
	// for example: 1,1,2,3,5,8,13,21,34,55.....
	
	
public ArrayList <Integer> fibGenerator(int n){
	
	ArrayList <Integer> nums = new ArrayList <Integer>();
	if (n == 0) {
		return nums;
	}else if (n ==1) {
		nums.add(1);
		
	}else {
	nums.add(1);
	nums.add(1);
	}
	for( int index = 2; index <n; index ++) {
		int x = nums.get(index -1) + nums.get(index-2);
			nums.add(x);
		}
	
	
	return nums;
	
}


public static void main (String [] args) {
	
	
	
	
	FibInterviewQuestion user = new FibInterviewQuestion();
	System.out.println(user.fibGenerator(2));
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
