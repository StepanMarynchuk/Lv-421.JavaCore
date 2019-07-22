package homeWork7;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
		Set <Integer> set1 = new HashSet<Integer>();
		Set <Integer> set2 = new HashSet<Integer>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			set1.add(rand.nextInt(40));
			set2.add(rand.nextInt(40));
		}
		System.out.println("Set 1: "+set1);
		System.out.println("Set 2: "+set2);
		System.out.println("intersect "+intersect(set1, set2));		
		System.out.println("union "+union(set1, set2));

	}
	
	public static Set<Integer> intersect (Set<Integer> set1, Set<Integer> set2) {
		Set <Integer> set = new HashSet<Integer>(set1);
		set.retainAll(set2);
		return set;
	}
	
	public static Set<Integer> union (Set<Integer> set1, Set<Integer> set2) {
		Set <Integer> set = new HashSet<Integer>(set1);
		set.addAll(set2);
		return set;
	}

}
