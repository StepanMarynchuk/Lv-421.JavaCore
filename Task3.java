package com.company;

import java.io.BufferedReader;
import java.io.IOException;

public class Task3 {

	public static void task3(BufferedReader br) throws IOException {

		System.out.print("Enter uah = ");
		double uah = Double.parseDouble(br.readLine());
		double usd = 25.1;
		double sum = uah / usd;
		double Off = Math.round(sum * 100.0) / 100.0;
		System.out.println("You will have = " + Off + " usd.");
	}

}
