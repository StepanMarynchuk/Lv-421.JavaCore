package less10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("-------------Task 1--------------");
		Thread thread = new Thread(new Run());
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("-------------Task 2--------------");		
		MyThread myThread1 = new MyThread("Hello, Peace", 2000);
		MyThread myThread2 = new MyThread("Peace in the World", 3000);
		myThread1.start();
		myThread2.start();
		try {
			myThread1.join();
			myThread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("My name is Yura :)");
		
		System.out.println("-------------Task 3--------------");
		
		try {
			BufferedReader brFr = new BufferedReader(new FileReader("C:\\Users\\mikiy\\eclipse-workspace\\SS courses\\practicalTask\\less10\\mytext.txt"));
			List <String> text = new ArrayList<String>();
			String lineText;
			while ((lineText = brFr.readLine()) != null) {
				text.add(lineText);
			}
			int lineLongest = 0;
			int lineShortest = text.get(0).length();
			int numLine = 0;
			for (String string : text) {
				System.out.println(++numLine + " Line has number of characters " + string.length());
				if (lineLongest < string.length()) {lineLongest = string.length();}
				if (lineShortest > string.length()) {lineShortest = string.length();}
				if (string.equalsIgnoreCase("var")) {System.out.println(string);}
			}
			System.out.println("number of characters of longest line is - " +  lineLongest);
			System.out.println("number og characters of shortest line is - " +  lineShortest);

			brFr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}




	}

}
