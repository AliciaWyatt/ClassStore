import java.util.ArrayList;
import java.util.List;

//creates an inventory item object - an array of attributes
public class InventoryItem extends ArrayList<Object>{	
	//required safety thing from Java compiler
	private static final long serialVersionUID = 1L;
	
	private static final int idLocation = 0;
	private static final int nameLocation = 1;
	private static final int priceLocation = 2;
	private static final int thresholdLocation = 3;	
	private static int count = 0;
	
	//creates an inventory item
	public InventoryItem(String name, double price, int threshold){
		count++;
		this.add(count);
		this.add(name);
		this.add(price);
		this.add(threshold);		
	}
	//displays the contents of an inventory item
	public void displayInventoryItem(){
		System.out.println("Item ID: " + getItemID());
		System.out.println("Item name: " + getName());
		System.out.println("Item price: " + getPrice());
		System.out.println("Reorder threshold: " + getThreshold());
		System.out.println("");
	}
	public void setName(String name) {
		this.set(nameLocation, name);
	}
	public void setPrice(double price) {
		this.set(priceLocation, price);
	}
	public void setThreshold(int threshold) {
		this.set(thresholdLocation, threshold);
	}
	public int getCount() {
		return count;
	}
	public int getItemID() {
		return (int)this.get(idLocation);
	}
	public String getName() {
		return (String)this.get(nameLocation);
	}
	public double getPrice() {
		return (double)this.get(priceLocation);
	}
	public int getThreshold() {
		return (int)this.get(thresholdLocation);
	}
	
}
