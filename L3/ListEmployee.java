
public class ListEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee ();
		e1.setName("Stepan");
		e1.setHour(1.0);
		e1.setRate(2.0);
		
		
		Employee e2 = new Employee ();
		e2.setName("Nata");
		e2.setHour(1.0);
		e2.setRate(2.0);
		
		
		Employee e3 = new Employee ();
		e3.setName("Vika");
		e3.setHour(1.0);
		e3.setRate(2.0);
		
		System.out.println(e1.getSalary());
		System.out.println(e2.getSalary());
		System.out.println(e3.getSalary());
		
		System.out.println(e1.getBonuses());
		System.out.println(e2.getBonuses());
		System.out.println(e3.getBonuses());
		
		
	}

}
