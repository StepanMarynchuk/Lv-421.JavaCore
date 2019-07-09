
public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] p = new Person[3];
		p[0] = new Student("d");
		p[1] = new Teacher("f",5,6);
		p[2]= new Cleaner ("g",4,2);
		for (int i = 0; i < p.length; i++) {
			p[i].getPrint();
			if (p[i] instanceof Staff) {
				System.out.println(((Staff)p[i]).getSalary());
			}
		}
		
		System.out.println(p[0]);
	



	}
}
