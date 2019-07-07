package Lesson4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practical2 {

	
	
	
	
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter any number from 1 to 7");
	String input = br.readLine();
	
	switch (input.toLowerCase()) {
	case "1":
		System.out.println("Ponedilok, Poniedzialek, Monday");
		break;
	case "2":
		System.out.println("Vivtorok, Wtorek, Tuesday");
		break;
	case "3":
		System.out.println("Sereda, Sroda, Wednesday");
		break;
	case "4":
		System.out.println("Chetver, Czwartek, Thursday");
		break;
	case "5":
		System.out.println("Pyatnytsya, Piatek, Friday");
		break;
	case "6":
		System.out.println("Subota, Sobota, Saturday");
		break;
	case "7":
		System.out.println("Nedilya, Niedziela, Sunday");
		break;
	default:
		System.out.println("Wrong");
		
	}
	
	
}
	
}


