package practicewithnooria;

public class Gift extends SantaList {

	private int cookies;
	private int toys;

	public Gift() {
		super();
		this.cookies = 0;
		this.toys = 0;
	}

	public Gift(int cookies, int toys) {
		super();
		this.cookies = cookies;
		this.toys = toys;
	}

	public int getCookies() {
		return cookies;
	}

	public void setCookies(int cookies) {
		this.cookies = cookies;
	}

	public int getToys() {
		return toys;
	}

	public void setToys(int toys) {
		this.toys = toys;
	}
	
	
	public int cookieTotal(int cookie) {
		if( cookies <= 0) {
			System.out.println("You are out of cookies");
		}else {
		cookies-=cookie;
		}
		return cookies;
	}
	
	public int toyTotal(int toy) {
		if(toys <= 0) {
			System.out.println("You are out of toys");
		}else {
		toys -= toy;
		}
		return toys;
	}



	public String toString() {
		return "Cookies: " + cookies + " Toys: " + toys;
	}

}
