package homework8;

import java.util.HashSet;
import java.util.Set;

public class SetApp {

	public static void main(String[] args) {
		//

		Set<Integer> set1 = new HashSet<Integer>(3);

		set1.add(1);
		set1.add(2);
		set1.add(3);
		for (Integer k : set1) {
			
		}

		Set<Integer> set2 = new HashSet<Integer>(3);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		for (Integer i : set2) {
			
		}
		union(set1, set2);
		intersection(set1, set2);
	}

	static private void union(Set set1, Set set2) {
		Set<Integer> set3 = new HashSet<Integer>(set1);
		set3.addAll(set2);
		System.out.println("Union = " + set3);

	}

	static private void intersection(Set set1, Set set2) {
		Set<Integer> set4 = new HashSet<Integer>(set1);
		set4.retainAll(set2);
		System.out.println("Intersection = " + set4);
	}
}
