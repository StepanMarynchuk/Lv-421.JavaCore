package homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_2 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter first number");
		int n1 =Integer.parseInt(br.readLine());
		System.out.println("second number");
		int n2 =Integer.parseInt(br.readLine());
		System.out.println("third number");
		int n3 =Integer.parseInt(br.readLine());
		
		System.out.println("Max number = " + Math.max(n1, Math.max(n2, n3)));
		System.out.println("Min number = " + Math.min(n1, Math.min(n2, n3)));
		
		
	}
}
