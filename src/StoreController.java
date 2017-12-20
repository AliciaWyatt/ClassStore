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
		
				
		
	}//end of main
	
}
