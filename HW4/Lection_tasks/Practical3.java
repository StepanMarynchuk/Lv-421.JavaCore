package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practical3 {

	public enum Continent {
		Africa, Asia, Europe, North_America, Australia, South_America;

	}
	
	

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter any Country");
		String input = br.readLine();
		
		Continent continent = Continent.Africa;
	
		
		switch (input.toLowerCase()) {
		case "Angola": case "Botswana": case "Nigeria":
			continent = Continent.Africa;
			break;
		case "Georgia": case "Nepal": case "Israel":
			continent = Continent.Asia;
			break;
		case "Malta": case "Portugal": case "Ukraine":
			continent = Continent.Europe;
			break;
		case "Pnama": case "Mexico": case "Canada":
			continent = Continent.North_America;
			break;
		case "Tonga": case "Vanuatu": case "Palau":
			continent = Continent.Australia;
			break;
		case "Argentina": case "Venezuela": case "Uruguay":
			continent = Continent.South_America;
			break;
		default:
			System.out.println("No this Country"); //always return No this Country.
		
		}

	}

}
