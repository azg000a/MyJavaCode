package oopsinClass;

public class VendingMachineInClass {

	Product[][] items;
	String machineId;

	public VendingMachineInClass() {
		this.items = new Product[3][3];
		this.machineId = "";
		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[row].length; col++) {
				items[row][col] = new Product();
			}
		}
	}

	public VendingMachineInClass(String machineId, int rowCount, int colCount) {

		this.machineId = machineId;
		this.items = new Product[rowCount][colCount];
		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[row].length; col++) {
				items[row][col] = new Product();
			}
		}
	}

	// add item method - should take a new product, row and col and add the product
	// to that address
	// should return a boolean true if added successfully and false is otherwise

	public boolean addItem(Product item, int row, int col) {
		if (items[row][col].quantity > 0) {
			System.out.println("This spot has been taken by another item!");
			return false;
		} else {

			items[row][col] = item;
			System.out.println("Item " + item + "successfully added to the spot " + row + ", " + col);
			return true;
		}

	}

	public String toString() {

		String temp = "MachineId: " + machineId + "\n";
		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[row].length; col++) {
				temp += items[row][col] + "\t\t";
			}
			temp += "\n";
		}
		temp += "===========================================";

		return temp;
	}

	// method purchase () is going to take int row and int col:
	// this method should check to see if the item is available
	// if so, drop the item and reduce the qty:
	// returns a boolean if item is sold, return true, false otherwise;

	public boolean purchase(int row, int col) {
		if (items[row][col].quantity > 0) {
			items[row][col].quantity--;
			System.out.println("Item " + items[row][col] + "dropped!");
			return true;
		} else {
			System.out.println("Item " + items[row][col] + " is out of stock");
			return false;
		}

	}

}
