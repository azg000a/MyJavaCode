package oopsinClass;

public class VendingM {

	Products[][] items;
	String machineId;

	public VendingM() {

		this.items = new Products[3][3];
		this.machineId = "";
		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[row].length; col++) {
				items[row][col] = new Products();
			}
		}

	}

	public VendingM(String machineId, int rowCount, int colCount) {

		this.machineId = machineId;
		this.items = new Products[rowCount][colCount];
		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[row].length; col++) {
				items[row][col] = new Products();
			}
		}
	}

	public boolean addItems(Products item, int row, int col) {
		if (items[row][col].qty > 0) {
			System.out.println("There is already an item in this section!");
			return false;
		} else {
			items[row][col] = item;
			System.out.println("Item: " + item + "succesfully added to the spot" + row + ", " + col);
			return true;
		}

	}

	public boolean purchaseItem(int row, int col) {
		if (items[row][col].qty < 0) {
			System.out.println("Currently Out of Stock!");
			return false;
		} else {
			items[row][col].qty--;
			System.out.println("Item: " + items[row][col] + "has been purchased successfully!");
			return true;
		}

	}

}
