package homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.println("Enter first float number");
		float n1 =Float.parseFloat(br.readLine());
		System.out.println("second number");
		float n2 =Float.parseFloat(br.readLine());
		System.out.println("third number");
		float n3 =Float.parseFloat(br.readLine());
		
		if (n1 >= -5 && n1 <= 5) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		if (n2 >=-5 && n2 <= 5) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		if (n3 >=-5 && n3 <=5) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
		
		
		

	}

}
