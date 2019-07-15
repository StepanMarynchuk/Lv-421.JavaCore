package newpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrList {

	public static void main(String[] args) {
		ArrayList<Integer> myCollection = new ArrayList<Integer>();
		myCollection.add(1);
		myCollection.add(2);
		myCollection.add(4);
		myCollection.add(8);
		myCollection.add(12);
		myCollection.add(6);
		myCollection.add(9);
		myCollection.add(15);
		myCollection.add(21);
		myCollection.add(7);

		System.out.println("col " + myCollection);

		Collections.sort(myCollection);
		System.out.println("sort col " + myCollection);

		ArrayList<Integer> newCollection = new ArrayList<Integer>();

		for (Integer integer : myCollection) {
			if (integer >= 5) {
				newCollection.add(integer);

			}
		}
		System.out.println("new col > 5" + newCollection);

		for (Iterator iterator = myCollection.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if (integer > 20) {
				iterator.remove();
			}
		}
		System.out.println("del > 20" + myCollection);

		myCollection.add(2, 1);
		if (myCollection.size() > 18) {
			myCollection.add(18, -3);
		}
		myCollection.add(5, -4);
		System.out.println("add el " + myCollection);
	}
}
