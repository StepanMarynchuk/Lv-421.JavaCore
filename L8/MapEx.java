package newpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Map<Integer, String> employeeMap = new HashMap();
		employeeMap.put(1, "Stepan");
		employeeMap.put(2, "Anna");
		employeeMap.put(3, "Vika");
		employeeMap.put(4, "Marta");
		employeeMap.put(5, "Ostap");
		employeeMap.put(6, "Mykola");
		employeeMap.put(7, "Oleg");

		System.out.println(employeeMap);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter ID");

		int a = Integer.parseInt(br.readLine());

		if (employeeMap.containsKey(a)) {
			System.out.println(employeeMap.get(a));
		} else {
			System.out.println(33 + " id does not exist");
		}
	}

}
