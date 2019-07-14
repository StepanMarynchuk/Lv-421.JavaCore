package less6;

public class MainPerson {

	public static void main(String[] args) {
		Person [] person = {new Student ("Ivan"), new Student ("Stepan"),
				new Teacher ("Mykola"), new Teacher ("Igor"), 
				new Cleaner("Oleg"), new Cleaner("Vasia")};
		for (int i = 0; i < person.length; i++) {
			System.out.println(person[i].getTUPE_PERSON() + " say - " + person[i].print());
			 if (person[i] instanceof Staff) {
				Staff s = (Staff) person[i];
				System.out.println("salary is: "+s.salary());
				
			}
		}


	}

}
