import java.util.ArrayList;
import java.util.List;

public class StoreController {
	
	
	public static void main(String[] args) {
		
		//create inventory items
		InventoryItem item1 = new InventoryItem("monkey", 15.00, 1);
		InventoryItem item2 = new InventoryItem("crocodile", 20.00, 0);
		System.out.println(item1.toString());
		
		item1.displayInventoryItem();
		item2.displayInventoryItem();
		
		
		//add items to inventory
		Inventory crochetInventory = new Inventory();
		crochetInventory.add(item1);
		crochetInventory.add(item2);
		crochetInventory.add(new InventoryItem("bunny", 6.00, 2));
		System.out.println(crochetInventory);
		
				
		/* testing
		
		List<Object> inventory = new ArrayList<Object>();
		List inventoryItem1 = new ArrayList();
		List inventoryItem2 = new ArrayList();
		List inventoryItem3 = new ArrayList();
		List inventoryItem4 = new ArrayList();
		List inventoryItem5 = new ArrayList();
		
		createItem(inventoryItem1, "monkey", 15.00, 1);
		createItem(inventoryItem2, "crocodile", 20.00, 1);
		createItem(inventoryItem3, "bunny", 6.00, 2);
		createItem(inventoryItem4, "flower", 1.25, 5);
		createItem(inventoryItem5, "hexagon", 1.50, 5);
		
		//displayItem(inventoryItem1);
		
		inventory.add(inventoryItem1);
		inventory.add(inventoryItem2);
		inventory.add(inventoryItem3);
		inventory.add(inventoryItem4);
		inventory.add(inventoryItem5);		
		
		displayInventory(inventory);
		
		end of testing */
		
				

	}//end of main
	
	//test methods
	public static void createItem(List item, String name, double price, int threshold) {
		item.add(name);
		item.add(price);
		item.add(threshold);		
	}	
	public static void displayItem(List item) {
		for(Object o: item) {
			System.out.print(o + " ");
		}
		System.out.println(" ");
	}	
	public static void displayInventory(List inventory) {
		for(Object o: inventory) {
			System.out.print(o + " ");
			System.out.println("");
		}
	}
	//end of test methods
}
