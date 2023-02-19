package basics;

public class VariablePractice {

	public static void main(String[] args) {


	int g = 10 * 2 - 4 / 2;
	
	int h = ++g * (g + 1);
	
	int u = ++g + --h * ++g;
	
	g = ++h;
	
	u = --g;
	
	System.out.println(g);
		System.out.println(h);
		System.out.println(u);
		
		
		
	}
	

}
