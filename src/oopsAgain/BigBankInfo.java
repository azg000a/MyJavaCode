package oopsAgain;

import java.util.ArrayList;

public class BigBankInfo {

	String address;
	String managerName;
	ArrayList<BigBank> customers;

	public BigBankInfo() {
		this.address = "";
		this.managerName = "";
		this.customers = new ArrayList<BigBank>();

	}

	public BigBankInfo(String address, String managerName) {
		this.address = address;
		this.managerName = managerName;
		this.customers = new ArrayList<BigBank>();

	}

	public void printBankInformation() {
		System.out.println("The bank address is: " + address);
		System.out.println("Bank Manager: " + managerName + "\n");
		System.out.println("******Current Bank Accounts*******" + "\n");
		for (int i = 0; i < customers.size(); i++) {
			System.out.println((i + 1) + ". " + customers.get(i).firstName + customers.get(i).lastName
					+ customers.get(i).accountNumber + customers.get(i).balance);
		}

	}

	public void addCustomers(BigBank number) {
		customers.add(number);

	}

}
