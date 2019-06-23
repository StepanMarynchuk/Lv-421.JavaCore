package edu.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("How are you?");
			String answer = br.readLine();
			System.out.println("you are " + answer);
	}

}