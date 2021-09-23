/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: TheScreen.java
 * 
 * Initializes the screen menu. Prints out the Gucci and Louis Vuitton Menu
 */
public class TheScreen {
	// Initialized objects
	SelectionScreen gucciMenu;
	SelectionScreen louisVuittonMenu;
	
	// Initialized constructor
	public TheScreen(SelectionScreen gucciMenu, SelectionScreen louisVuittonMenu) {
		this.gucciMenu = gucciMenu;
		this.louisVuittonMenu = louisVuittonMenu;
	}
	
	// prints out menu for Gucci and Louis Vuitton
	public void printMenu() {
		Iterator gucciIterator = gucciMenu.createIterator();
		Iterator lvIterator = louisVuittonMenu.createIterator();
		
		System.out.println("The Selection Screen\n\n*----Gucci----*\n");
		printMenu(gucciIterator);
		System.out.println("\n*----Louis Vuitton----*\n");
		printMenu(lvIterator);
		System.out.println("\n*----Eco Friendly----*\n");
		printEcoFriendly();
		
	}
	
	private void printMenu(Iterator it) {
		while (it.hasNext()) {
			SelectionScreenItem ss = it.next();
			System.out.print(ss.getBrand() + "\n ");
			System.out.print("$" + ss.getPrice() + "\t|  ");
			System.out.println(ss.getDesc() + "\n");
		}
	}
	
	// prints out all eco friendly bags regardless of brand name
	public void printEcoFriendly() {
		printEcoFriendly(gucciMenu.createIterator());
		printEcoFriendly(louisVuittonMenu.createIterator());
	}

	private void printEcoFriendly(Iterator iterator) {
		while (iterator.hasNext()) {
			SelectionScreenItem ssi = iterator.next();
			if (ssi.isEcoFriendly()) {
				System.out.print(ssi.getBrand() + "\n ");
				System.out.print("$" + ssi.getPrice() + "\t|  ");
				System.out.println(ssi.getDesc() + "\n");
			}
		}
	}
}
