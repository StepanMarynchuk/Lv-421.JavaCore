import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Person p1 = new Person("Mark", "Kaplan", 1990);		
		Person p2 = new Person("Daria", "Martova", 1993);
		Person p3 = new Person("Janush", "Kowalsky", 1952);
		p1.output();
		p2.output();
		p3.output();
		System.out.println();
		
		Person p4 = new Person();
		p4.output();
		p4.input();
		p4.output();
		System.out.println();
		
		Person p5 = new Person();
		p5.output();
		p5.input();
		p5.output();
		System.out.println();
		
		}
	}
