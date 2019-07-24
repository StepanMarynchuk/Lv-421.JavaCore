package homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Div {

	public static void main(String[] args) {
//Create method div(), which calculates the dividing of two double numbers. In main method input 2 double 
//numbers and call this method. Catch all exceptions. 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		int b = 0;

		try {
			System.out.println("Entered number 'a':");
			a = Integer.parseInt(br.readLine());
			System.out.println("Entered number 'b':");
			b = Integer.parseInt(br.readLine());
			
		} 
		catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Answer:"+" "+ div (a, b));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static int div(int x, int y) throws Exception {
		if (y == 0)
			throw new Exception("prohibited, 0 cannot be divided, choose other numbers");
		return x /y;
	}
}