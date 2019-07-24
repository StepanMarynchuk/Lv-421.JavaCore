package homework8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapType {

	public static void main(String[] args) {

		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Marynchuk", "Stepan");
		personMap.put("Shegynska", "Marta");
		personMap.put("Khapko", "Anna");
		personMap.put("Chernenko", "Andriy");
		personMap.put("Portnova", "Nastya");
		personMap.put("Havrilyak", "Ivanna");
		personMap.put("Berehivkiy", "Ihor");
		personMap.put("Bratkiv", "Lidia");
		personMap.put("Boyko", "Dana");
		personMap.put("Pogba", "Paul");
		
		for (Map.Entry entry : personMap.entrySet()) {
	
		
		    System.out.println("Key: " + entry.getKey() + " Value: "
		        + entry.getValue());
			
		}
		   System.out.println();
		   

		personMap.remove("Pogba");
		System.out.println(personMap);
		
		System.out.println();
		
//		for (Map.Entry e : personMap.entrySet()) {
//		
//			if (personMap.getValues(e) == personMap.entrySet()) {
//				System.out.println("There are at less two persons");
//			
			//There are at less two persons with the same firstName among these 10 people?

	}
	
	}
	
	

