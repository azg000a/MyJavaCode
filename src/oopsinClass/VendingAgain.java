package oopsinClass;

import java.util.ArrayList;

public class VendingAgain {

	// add items
	// purchase using address but first check if it is available

	VendingProducts[][] items;
	String machineId;

	public VendingAgain() {
		this.items = new VendingProducts[3][3];
		this.machineId = "";
		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[row].length; col++) {
				items[row][col] = new VendingProducts();
			}
		}
	}

	public VendingAgain(String machineId, int rowCount, int colCount) {

		this.machineId = machineId;
		this.items = new VendingProducts[rowCount][colCount];
		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[row].length; col++) {
				items[row][col] = new VendingProducts();
			}

		}

	}

	public boolean addItems(VendingProducts item, int row, int col) {
		if (items[row][col].quantity > 0) {
			System.out.println("This spot is being used by another item");
			return false;
		} else {
			items[row][col] = item;
			System.out.println("You have added the following item: "+ item);
			return true;
		}

	}

	public boolean purchase(int row, int col) {
		if (items[row][col].quantity <= 0) {
			System.out.println("Out of Stock!");
			return false;
		} else {
			items[row][col].quantity--;
			System.out.println("Your purchase was successfully completed!" + "The item quantity has been updated "+ items[row][col]);
			return true;
		}

	}

	public String toString() {
		String line = "";
		for (int row = 0; row < items.length; row ++) {
			for (int col = 0; col < items[row].length; col ++) {
				line+= items [row][col] + "\t\t";
			}
			line += "\n";
		}
		return line;
	}

}
