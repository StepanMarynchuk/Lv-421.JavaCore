import Fruits.Citrus;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//
		String name, color;
		Fruit fruit = new Fruit();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter fruit name:");
		name = in.next();
		System.out.print("Enter fruit color:");
		color = in.next();
		in.close();
		fruit.input(name, color);
		fruit.print();

		Citrus lemone = new Citrus("lemon", "yellow", 23.2);
		lemone.print();
//////////////////////////////////////////////
		ArrayList<Citrus> fruitList = new ArrayList<>();
		// fruitList.add( new Fruit("Apple", "red" ));
		// fruitList.add(new Fruit( "banana", "yellow"));
		fruitList.add(new Citrus("lemon", "yellow", 40));
		// fruitList.add(new Fruit( "pear", "green"));
		fruitList.add(new Citrus("orange", "orange", 60));
	}
}
