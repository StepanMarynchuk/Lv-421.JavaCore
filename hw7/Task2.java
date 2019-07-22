package homeWork7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class Task2 {
	public static void main(String[] args) {
	
	Map <String, String> person = new HashMap<String, String>();
	person.put("Mykytyuk", "Yura");
	person.put("Kapusta", "Yura");
	person.put("Salo", "Ivan");
	person.put("Borshch", "Ivan");
	person.put("Koka", "Yura");
	person.put( "Grimm", "Orest");
	person.put("Stopkran", "Petro");
	person.put("Valet", "Oleg");
	person.put("Storm", "Petro");
	person.put("Mamalyga", "Orest");
	System.out.println(person);
	
	for (Map.Entry<String, String> entry : person.entrySet()) {
		String name = entry.getValue();
		entry.setValue(null);
		if (!person.containsValue(name)) {
			System.out.println("There are at less two persons");
			entry.setValue(name);
			break;
		}
		entry.setValue(name);
	}
	for (Iterator<Entry<String, String>> i = person.entrySet().iterator(); i.hasNext();) {
		Entry<String, String> entry = (Entry<String, String>) i.next();
		if (entry.getValue()=="Orest") {
			i.remove();
		}	
	}
	System.out.println("Map without all Orest");	
	System.out.println(person);
	}
}
