package academy.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double c1 = 0.05; //price for Country 1
		double c2 = 0.10; //price for Country 2
		double c3 = 0.20; //price for Country 3
		
				
		
		System.out.println("Enter the duration of call from Country 1");
		int t1 = Integer.parseInt(br.readLine());
		System.out.println("Price of the call is:");
		System.out.println(t1*c1 + "$");
		
		System.out.println("Enter the duration of call from Country 2");
		int t2 = Integer.parseInt(br.readLine());
		System.out.println("Price of the call is:");
		System.out.println(t2*c2 + "$");
		
		System.out.println("Enter the duration of call from Country 3");
		int t3 = Integer.parseInt(br.readLine());
		System.out.println("Price of the call is:");
		System.out.println(t3*c3 + "$");
		
		System.out.println("Total price for all calls:");
		System.out.println((t1*c1)+(t2*c2)+(t3*c3));
	}

}
