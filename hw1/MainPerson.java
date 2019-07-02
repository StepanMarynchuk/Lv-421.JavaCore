package MyPack;

import java.io.IOException;

public class MainPerson {

	public static void main(String[] args) throws IOException {
		
		Persons p1= new Persons ("Yura", "Schet", 2000);
		p1.changeFirsName("Nazar");
		
		System.out.println(p1);
		System.out.println("Age" + " " + p1.getFirstName() +"-"+ p1.getAge());
	

		Persons p2= new Persons ("Dima", "Dot", 1999);
		System.out.println(p2);
		System.out.println("Age" + " " + p2.getFirstName() +"-"+ p2.getAge());
		
		Persons p3= new Persons ("Andriy","Ivas", 2001);
		System.out.println(p3);
		System.out.println("Age" + " " + p3.getFirstName() +"-"+ p3.getAge());
		
		Persons p4= new Persons ("Mihailo", "Koprak", 1989);
		System.out.println(p4);
		System.out.println("Age" + " " + p4.getFirstName() +"-"+ p4.getAge());
		
		Persons p5= new Persons ("Vitalik", "Druz'",1972);
		System.out.println(p5);
		System.out.println("Age" + " " + p5.getFirstName() +"-"+ p5.getAge());
		
		
	}
		

	}


