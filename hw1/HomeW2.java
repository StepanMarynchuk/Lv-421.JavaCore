package MyPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeW2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What is you name ?");
		String name = bf.readLine();
		System.out.println("Where are you live " + name + "?");
		String live = bf.readLine();
		System.out.println("Hello " + name);
		System.out.println("You are from "+ live);
	}

}
