import java.util.ArrayList;
import java.util.List;

/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: TheLouisVuittonMenu.java
 * 
 * iterates through the Louis Vuitton menu
 */
public class TheLouisVuittonMenuIterator implements Iterator {
	List<SelectionScreenItem> items;
	int position = 0;
	
	public TheLouisVuittonMenuIterator(List<SelectionScreenItem> items) {
		this.items = items;
	}
	
	public SelectionScreenItem next() {
		return items.get(position++);
	}
	
	public boolean hasNext() {
		return items.size() > position;
	}
	
}
