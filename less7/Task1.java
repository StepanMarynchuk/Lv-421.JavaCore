package less7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(rand.nextInt(30));
		}
		System.out.println("first random list: "+list);
		
		List<Integer> listMor5 = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > 5) listMor5.add(list.get(i));
		}
		System.out.println("list more than 5: "+listMor5);
		

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) >= 20) list.remove(i);	
		}
		System.out.println("list less than 20: "+list);
		
		if (list.size()>1) list.set(1, 1);
		if (list.size()>7) list.set(7, -3);
		if (list.size()>4) list.set(4, -4);
		System.out.println("list with inserts: "+list);
		
		Collections.sort(list);
//		list.sort(Comparator.naturalOrder());
		System.out.println("sorted list: "+list);
	}
}
