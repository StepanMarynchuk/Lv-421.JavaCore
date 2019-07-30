package finalproject;

import java.util.Comparator;

public class YearComparator implements Comparator <Wine> {
	
	public int compare (Wine 01, Wine 02) {
		
		return ( (Wine) 01).getYear().compareTo(((Wine) 02).getYear());
	}
}