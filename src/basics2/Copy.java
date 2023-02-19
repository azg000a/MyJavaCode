package basics2;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		package date_16_11;
		import java.util.Scanner;
		public class MenuSystemExampleWithScanner {
		    public static void main(String[] args) {
		        // STEP 1. Create your variables
		        Scanner sc = new Scanner(System.in);
		        // variables for create account flow
		        String userName = "";
		        String firstName = "";
		        String lastName = "";
		        String email = "";
		        String password = "";
		        // variables for login flow
		        String userNameEntered = "";
		        String passwordEntered = "";
		        // STEP 2. print the menu options and expect/capture values from console
		        System.out.println("1. Login");
		        System.out.println("2. Create Account");
		        int op1 = sc.nextInt();
		        if (op1 == 1) {
		            // Login flow
		            System.out.println("Login:");
		            System.out.println("Please provide User Name:");
		            userNameEntered = sc.next();
		            // STEP 3. compare the entered user and pass to the ones we have
		            if (userNameEntered.equals(userName)) {
		                // correct user name, check the password
		                System.out.println("Please provide Password:");
		                passwordEntered = sc.next();
		                if (passwordEntered.equals(password)) {
		                    // the pass was correct as well
		                    System.out.println("USER & PASS were both verified!");
		                } else {
		                    System.out.println("Invalid Psssword!");
		                }
		            } else {
		                // incorrect user name
		                System.out.println("Invalid User Name!");
		            }
		        } else if (op1 == 2) {
		            // Create flow
		            System.out.println("Create Account:");
		            System.out.println("Please provide User Name:");
		            userName = sc.next();
		            System.out.println("Please provide First Name:");
		            firstName = sc.next();
		            System.out.println("Please provide Last Name:");
		            lastName = sc.next();
		            System.out.println("Please provide Email:");
		            email = sc.next();
		            System.out.println("Please provide Password:");
		            password = sc.next();
		            System.out.println("Please confirm your Password:");
		            passwordEntered = sc.next();
		            if (passwordEntered.equals(password)) {
		                System.out.println("Account Created Successfully!");
		            } else {
		                System.out.println("Passsword mismatch!");
		            }
		            // temp solution to ask the user to login
		            // Login flow
		            System.out.println("Login:");
		            System.out.println("Please provide User Name:");
		            userNameEntered = sc.next();
		            // STEP 3. compare the entered user and pass to the ones we have
		            if (userNameEntered.equals(userName)) {
		                // correct user name, check the password
		                System.out.println("Please provide Password:");
		                passwordEntered = sc.next();
		                if (passwordEntered.equals(password)) {
		                    // the pass was correct as well
		                    System.out.println("USER & PASS were both verified!");
		                } else {
		                    System.out.println("Invalid Psssword!");
		                }
		            } else {
		                // incorrect user name
		                System.out.println("Invalid User Name!");
		            }
		        } else {
		            // out of range
		            System.out.println("Your selection is not a valid option!");
		        }
		        // menu
		        // 1. Login
		        // 2. Create Account
		        // you select an option
		        // 1. Login
		        // User Name:
		        // Password:
		        // give a message
		        // you select an option
		        // 2. Create Account
		        // UserName:
		        // First Name:
		        // Last Name:
		        // Email:
		        // Password:
		        // Confirm Password:
		    }
		}
	}

}
