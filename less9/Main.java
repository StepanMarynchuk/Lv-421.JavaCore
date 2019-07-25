package less9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("--------------Task 1 rectangle---------------");	
		
		try {
			System.out.println("try 1  - "+Task1.trySquareRectangle(2, -1));
		}catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			System.out.println("try 2  - "+Task1.trySquareRectangle(2, 2));
		}catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		
		
		System.out.println("--------------Task 2 plant---------------");
		
		List <Plant> plants = new ArrayList<Plant>();
		try {
			plants.add(new Plant("Red", "Plant", 1));
		}catch(ColorException|TypeException e) {
			System.err.println(e.getMessage());
		}
		try {
			plants.add(new Plant("Yellow", "cactus", 2));
		}catch(ColorException|TypeException e) {
			System.err.println(e.getMessage());
		}
		try {
			plants.add(new Plant("red", "cactus", 3));
		}catch(ColorException|TypeException e) {
			System.err.println(e.getMessage());
		}
		try {
			plants.add(new Plant("Blue", "Annuals", 4));
		}catch(ColorException|TypeException e) {
			System.err.println(e.getMessage());
		}
		try {
			plants.add(new Plant("white", "herbs", 5));
		}catch(ColorException|TypeException e) {
			System.err.println(e.getMessage());
		}
		try {
			plants.add(new Plant("blue", "pion", 6));
		}catch(ColorException|TypeException e) {
			System.err.println(e.getMessage());
		}
		for (Iterator<Plant> iterator = plants.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());	
		}	
	}
}
