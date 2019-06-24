package edu.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.println("Enter number");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter one more number");
		int b = Integer.parseInt(br.readLine());
		System.out.println((a+b)+ " sum");		
		System.out.println((a-b)+ " difference");
		System.out.println((a*b)+ " multiplication");
		System.out.println((a/b)+ " division");
	}

}
