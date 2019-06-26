package hometask;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee ();
		e1.setName("Stepan");
		e1.setHour(2);
		e1.setRate(2);
		
		
		Employee e2 = new Employee ();
		e2.setName("Nata");
		e2.setHour(3);
		e2.setRate(2);
		e2.setRate(4);
		
		
		Employee e3 = new Employee ();
		e3.setName("Vika");
		e3.setHour(4);
		e3.setRate(2);
		
		
		System.out.println(e1);
		System.out.println("Salary:" +" "+ e1.getSalary());
		System.out.println("Bonus:" +" "+e1.getBonuses());
		System.out.println("Salary with bonus:" +" "+ (e1.getBonuses()+ e1.getSalary()));
	
		
		
		System.out.println(e2);
		System.out.println("Salary:" +" "+e2.getSalary());
		System.out.println("Bonus:" +" "+e2.getBonuses());
		System.out.println ("Salary with bonus:" +" "+ (e2.getBonuses()+ e2.getSalary()));
		
		System.out.println(e3);
		System.out.println("Salary:" +" "+e3.getSalary());
		System.out.println("Bonus:" +" "+e3.getBonuses());
		System.out.println("Salary with bonus:" +" "+(e3.getBonuses()+ e3.getSalary()));
		
		System.out.println("Total sum:" + " "+ Employee.getTotalSum());
	}

}
