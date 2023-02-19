package oopsinClass;

import java.util.ArrayList;

public class Bank {
	
	String address;
	String managerName;
	ArrayList <BankAccount> customers;	//arrayList is dynamic so we don't have to keep track of how many customers are added or removed!

	
	
	public Bank() {
		this.address = "";
		this.managerName = "";
		this.customers = new ArrayList<BankAccount>();
		
		
	}
	
	
	public Bank (String address, String managerName) {
		
		this.address = address;
		this.managerName = managerName;
		this.customers = new ArrayList<BankAccount>();
	
		
	}
	
	
	
	public void printBankInfo() {
		
		System.out.println("Manager: " +managerName );
		System.out.println("Address: " + address);
		System.out.println("****** Customer List *******");
		for(int i = 0; i < customers.size(); i++) {
			
			
			System.out.println((i+1) + ". " + customers.get(i).accountNumber + " " + customers.get(i).balance);
		}
	}
	
	
	
	public void addCustomer(BankAccount number) {
		customers.add(number);
	}
	
	
	
	
	
	
	
}
