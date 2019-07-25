package homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNum {

	public static void main(String[] args) {
		// Write a method readNumber(int start, int end), that read from console integer
		// number and return it, if it is in the range [start...end].

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int start = 0;
		int end = 0;
		int n = 0;
		try {
			System.out.println("Enter start range :");
			start = Integer.parseInt(br.readLine());
			System.out.println("Enter end range :");
			end = Integer.parseInt(br.readLine());
			System.out.println("Enter any number :");
			n = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Answer:" + " " + readNumber(2, 7, 9));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static int readNumber(int x, int y, int z) throws Exception {
		if (z <= x || z >= y) {
			throw new Exception(z + " isn't belong to the range");
		}
		return z;

	}

}