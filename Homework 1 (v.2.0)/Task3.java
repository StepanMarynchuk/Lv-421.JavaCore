package home.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter standart unit c1 (USD) for the call with country 1:");
		double c1= Double.parseDouble(br.readLine());
		
		System.out.println("Enter duration (min) of a talk t1:");
		double t1=Double.parseDouble(br.readLine());
		System.out.println("Call with country 1 costs:" + " "+ (c1*t1) + " "+ "USD");
		

		System.out.println("Enter standart unit c2 (USD) for the call with country 2:");
		double c2= Double.parseDouble(br.readLine());
		
		System.out.println("Enter duration (min) of a talk t2:");
		double t2=Double.parseDouble(br.readLine());
		System.out.println("Call with country 2 costs:" + " "+ (c2*t2) + " "+ "USD");
		
		System.out.println("Enter standart unit c3 (USD) for the call with country 3:");
		double c3= Double.parseDouble(br.readLine());
		
		System.out.println("Enter duration (min) of a talk t3:");
		double t3=Double.parseDouble(br.readLine());
		System.out.println("Call with country 3 costs:" + " "+ (c3*t3) + " "+ "USD");

		System.out.println("Call with three countries together costs:" + " "+ (c3*t3+c1*t1+c2*t2) +" "+ "USD");

	}

}
