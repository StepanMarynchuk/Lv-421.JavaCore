package less3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainPersons {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Person person1 = new Person("Yura", "Mykytyuk", 1987);		
		Person person2 = new Person("Wasia", "Octopus", 1988);
		Person person3 = new Person("Andriy", "Stomatolog", 1999);
		Person person4 = new Person("Oksana", "Brin", 1960);
		Person person5 = new Person("Julia", "Trump", 2001);
			
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();
		System.out.println("---------------------");
		
		Person person6 = new Person();
		person6.output();
		person6.input();
		person6.output();
		System.out.println("---------------------");
		
		System.out.println("Create a new person? Enter: 1 - Yes;  0 - No;");
		int decision = Integer.parseInt(br.readLine());
		if (decision == 0) System.out.println("-----------goodbye----------");
		else {
			System.out.println("Ok, create a new person!");
			Person person7 = new Person();
			person7.input();
			person7.output();

		}
	}

}
