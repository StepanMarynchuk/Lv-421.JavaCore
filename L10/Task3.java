package less.ons10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {

		String fileName = "mytext.txt";
		// FileReader fr = null;
		// BufferedReader br = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String s = null;
			int count = 0;
			System.out.println("Read data from file: " + fileName);

			List<String> list = new ArrayList<String>();
			while ((s = br.readLine()) != null) {
				System.out.println("row " + ++count + " read:" + s);
				list.add(s);

			}

			System.out.println(list.size());

			for (String string : list) {
				if (string.contains("is"))
					System.out.println(string);
					
			}
			
			for (String s2 : list) {
				
				System.out.println(s2.length());
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	private static String list() {
		// TODO Auto-generated method stub
		return null;
	}
}
