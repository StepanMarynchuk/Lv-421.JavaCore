package finalproject;

import java.util.Comparator;

public class YearComparator implements Comparator <Wine> {
	public int compare (Wine a, Wine b) {
		return a.getYear()-b.getYear();
	}

}
