package home.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("What is your name?");
		 String name= br.readLine();
		 System.out.println("My name is" + " " + name);
		 System.out.println("Where do you live," + " " + name + "?");
		 String address= br.readLine();
		 System.out.println("I live in" + " " + address);
	}

}
