package homework8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapType {

	public static void main(String[] args) {

		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Marynchuk", "Stepan");
		personMap.put("Shegynska", "Marta");
		personMap.put("Khapko", "Anna");
		personMap.put("Chernenko", "Andriy");
		personMap.put("Portnova", "Stepan");
		personMap.put("Havrilyak", "Ivanna");
		personMap.put("Berehivkiy", "Ihor");
		personMap.put("Bratkiv", "Lidia");
		personMap.put("Boyko", "Dana");
		personMap.put("Pogba", "Paul");

		for (Map.Entry entry : personMap.entrySet()) {

			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());

		}
		System.out.println();

		personMap.remove("Pogba");
		System.out.println(personMap);

		System.out.println();
		
		Set<String> set = new HashSet<String>();

		for (Map.Entry<String, String> e : personMap.entrySet()) {

			set.add(e.getValue());
		}
		
		if (set.size() == personMap.entrySet().size()) {
			System.out.println("All names are different");
		} else {
			System.out.println("All names arethe same");

		}
	}
}
