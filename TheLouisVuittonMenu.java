import java.util.ArrayList;
import java.util.List;

/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: TheLouisVuittonMenu.java
 * 
 * Creates and holds the Louis Vuitton menu
 */
public class TheLouisVuittonMenu implements SelectionScreen {
	List<SelectionScreenItem> sItems;
	
	public TheLouisVuittonMenu() {
		sItems = new ArrayList<SelectionScreenItem>();
		
		addItem("Grand Palais", "a bag made by a grand", true, 3500.99);
		addItem("Petit Palais", "a bag made by a petite person", false, 9999.38);
		addItem("Sac Plat BB", "a bag made by a huge sack with a platinum bb", true, 3240.01);
		addItem("Petit Sac Plat", "a bag made by a petite sack that is platinum", true, 1820.45);
		addItem("Petite Biote Chapeau", "a bag made by a petite cheap person", false, 999.82);
		addItem("Petite Malle", "a bag made by a petite paul blark", false, 1911.67);
		
	}
	
	public void addItem(String brand, String desc, boolean ecoF, double price) {
		SelectionScreenItem sItem = new SelectionScreenItem(brand, desc, ecoF, price);
		sItems.add(sItem);
	}
	
	public List<SelectionScreenItem> getLVMenuItems() {
		return sItems;
	}
	
	public Iterator createIterator() {
		return new TheLouisVuittonMenuIterator(sItems);
	}
	
	public String toString() {
		return "Ayooooooooo we ballinnnnn";
	}
	
}
