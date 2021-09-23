import java.util.*;
/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: SelectionScreenTestDrive.java
 * 
 * The driver code
 * 
 */
public class SelectionScreenTestDrive {
	public static void main(String args[]) {
		// Initialized objects
		SelectionScreen gucciMenu = new TheGucciMenu();
		SelectionScreen louisVuittonMenu = new TheLouisVuittonMenu();
		
		// creates menu utilizing both menus
		TheScreen ts = new TheScreen(gucciMenu, louisVuittonMenu);
		
		// prints out the menu
		ts.printMenu();
	}
}
