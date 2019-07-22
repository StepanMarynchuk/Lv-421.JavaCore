package less7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Map <Integer, String> emploeeMap = new HashMap <Integer, String>();
		emploeeMap.put(1, "Yura");
		emploeeMap.put(2, "Julia");
		emploeeMap.put(3, "Yana");
		emploeeMap.put(4, "Oleg");
		emploeeMap.put(5, "Oksana");
		emploeeMap.put(6, "Petro");
		emploeeMap.put(7, "Oleg");
		System.out.println(emploeeMap);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id: ");
		int id = Integer.parseInt(br.readLine());
		if (emploeeMap.containsKey(id)) System.out.println(emploeeMap.get(id));
		
		System.out.println("Enter the name: ");
		String name = br.readLine();
		if (emploeeMap.containsValue(name)) { 			
			for (Map.Entry<Integer, String> entry : emploeeMap.entrySet()) {
				if (entry.getValue().equals(name)) {
					System.out.println("id with this name - "+entry.getKey());
				}
			}
		}

	}

}
