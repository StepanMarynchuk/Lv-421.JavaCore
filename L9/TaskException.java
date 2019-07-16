package newpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskException {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// try {

		int a = 0;
		int b = 0;
		try {
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} 

		try {
			System.out.println(getSquare(a, b));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	static int getSquare(int x, int y) throws Exception{
		if (x < 0 || y < 0) throw new Exception("a or b < 0");
		return x*y;
	}
}
