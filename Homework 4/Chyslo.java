package home.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chyslo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number 1:");
		float n1 = Float.parseFloat(br.readLine());

		System.out.println("Enter number 2:");
		float n2 = Float.parseFloat(br.readLine());

		System.out.println("Enter number 3:");
		float n3 = Float.parseFloat(br.readLine());

		if (n1 >=-5 && n1 <= 5) {
			
			System.out.println(n1 + " " + "is belong to the range [-5;5]");
		} else
			System.out.println(n1+ " "+ " isn't belong to the range [-5;5]");

		if (n2 > -5 && n2 < 5) {
			System.out.println(n2 + " " + "is belong to the range [-5;5]");
		}

		else
			System.out.println(n2+ " "+ " isn't belong to the range [-5;5]");

		if (n3 > -5 && n3 < 5) {
			System.out.println(n3 + " " + "is belong to the range [-5;5]");
		}

		else
			System.out.println(n3+ " "+ " isn't belong to the range [-5;5]");
	}
}
