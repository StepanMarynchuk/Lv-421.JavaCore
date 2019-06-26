package less3;

public class MainPersons {

	public static void main(String[] args)
	{
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
		System.out.println(person1.getFirstName() +"Age - "+ person1.getAge());

		Person person6 = new Person();
		person6.output();
		person6.input("Kolia", "Ret", 1950);
		person6.output();
		System.out.println(person6.getFirstName() +"Age - "+ person6.getAge());
		
	}

}
