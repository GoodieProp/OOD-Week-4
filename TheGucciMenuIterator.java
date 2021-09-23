/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: TheGucciMenuIterator.java
 * 
 * iterates through the Gucci menu
 */
public class TheGucciMenuIterator implements Iterator {
	SelectionScreenItem[] items;
	int position = 0;
	
	public TheGucciMenuIterator(SelectionScreenItem[] items) {
		this.items = items;
	}
	
	public SelectionScreenItem next() {
		return items[position++];
	}
	
	public boolean hasNext() {
		return items.length > position;
	}
	
}
