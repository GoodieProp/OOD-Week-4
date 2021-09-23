/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: TheGucciMenu.java
 * 
 * Creates and holds the Gucci menu
 */
public class TheGucciMenu implements SelectionScreen {
	static final int MAX_ITEMS = 7;
	int numberOfItems = 0;
	SelectionScreenItem[] sItems;
	
	public TheGucciMenu() {
		sItems = new SelectionScreenItem[MAX_ITEMS];
		
		addItem("Gucci Diana", "a bag named diana", true, 3240.28);
		addItem("Jackie 1961", "a bag named Jackie, who was born in 1961", false, 5000.11);
		addItem("Ophidia", "a bag debuted on the Cruise 2018 catwalk which consisted of cats", false, 1300.46);
		addItem("GG Marmont", "a bag made of marmite", true, 1234.56);
		addItem("Gucci Horsebit 1955", "a bag made of horse bits", false, 5991.74);
		addItem("Dionysus", "a bag created by a god", true, 4620.29);
		addItem("Sylvie", "a bag created by master artisans", false, 1111.97);
	}
	
	public void addItem(String brand, String desc, boolean ecoF, double price) {
		SelectionScreenItem sItem = new SelectionScreenItem(brand, desc, ecoF, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Yeah....I'm not gonna add it to the menu. Why you might ask? Because no.");
		} else {
			sItems[numberOfItems] = sItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	public SelectionScreenItem[] getScreenItems() {
		return sItems;
	}
	
	public Iterator createIterator() {
		return new TheGucciMenuIterator(sItems);
	}
	
	public String toString() {
		return "yusss";
	}
	
}
