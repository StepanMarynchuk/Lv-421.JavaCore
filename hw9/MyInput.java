package homeWork9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInput {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int myInputInteger() throws NumberFormatException, IOException {
		int myInt = Integer.parseInt(br.readLine());
		return myInt;
	}
	
	public static double myInputDouble() throws NumberFormatException, IOException {
		double myDouble = Double.parseDouble(br.readLine());
		return myDouble;
	}

}
