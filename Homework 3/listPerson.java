package hometask;

import java.io.IOException;

public class listPerson {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Person p1= new Person ("Stepan", "Marynchuk", 1993);
		p1.changeFirsName("Oleg");
		
		System.out.println(p1);
		System.out.println("Age" + " " + p1.getFirstName() +"-"+ p1.getAge());
	

		Person p2= new Person ();
		p2.newPerson();
		System.out.println(p2);
		System.out.println("Age" + " " + p2.getFirstName() +"-"+ p2.getAge());
		
		Person p3= new Person ("Marta","Shegynska", 1997);
		System.out.println(p3);
		System.out.println("Age" + " " + p3.getFirstName() +"-"+ p3.getAge());
		
		Person p4= new Person ("Anna", "Khapko", 1954);
		System.out.println(p4);
		System.out.println("Age" + " " + p4.getFirstName() +"-"+ p4.getAge());
		
		Person p5= new Person ("Vira", "Boyko",1972);
		System.out.println(p5);
		System.out.println("Age" + " " + p5.getFirstName() +"-"+ p5.getAge());
		
		
	}

	
}
