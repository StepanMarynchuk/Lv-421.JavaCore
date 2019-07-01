import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Person p1 = new Person("John","Wick",1999);
		Person p2 = new Person("Smith","Net",1998);
		Person p3 = new Person("Jin","Gale",1997);
		Person p4 = new Person();
		Person p5 = new Person();
		p4.Input();
		p5.Input();
		p5.changeName("Nino", null);
		p1.output();
		p2.output();
		p3.output();
		p4.output();
		p5.output();
	}

}
