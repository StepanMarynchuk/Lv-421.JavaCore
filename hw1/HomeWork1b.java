package less1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork1b {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String address1;
		String address2;
		String address3;
		String name1;
		String name2;
		String name3;
		String namex;
		address1 = "Lviv";
		address2 = "Odessa";
		address3 = "Kyiv";
		name1 = "Olia";
		name2 = "Julia";
		name3 = "Ira";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the name");
		namex = br.readLine();
		if (namex.equals(name1))
			System.out.print("You are live in the " + address1 + ", " + name1);
		else if (namex.equals(name2))
			System.out.print("You are live in the " + address2 + ", " + name2);
		else if (namex.equals(name3))
			System.out.print("You are live in the " + address3 + ", " + name3);
		else
			System.out.print("We don't know your name");
	}

}
