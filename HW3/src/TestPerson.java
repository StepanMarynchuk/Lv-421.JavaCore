import java.io.IOException;

public class TestPerson {

	public static void main(String[] args) throws IOException, Exception {
		Person p1 = new Person("Marta", "Romanovych", 1992);
		Person p2 = new Person("Mariya", "Glushko", 2000);
		Person p3 = new Person("Igor", "Gus", 1994);
		Person p4 = new Person("Anna", "Nemyriv", 1996);
		Person p5 = new Person("Maksym", "Lun", 1994);
		Person p6 = new Person();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println();

		p5.setFirstName("Alina");
		System.out.println(p5);
 
		p1.output();
		p2.output();
		p3.output();
		p4.output();
		p5.output();
		

		p6.input();   //not  sure about this method
		
		
	}

}
