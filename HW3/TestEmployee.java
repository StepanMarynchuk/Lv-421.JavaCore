
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Marta", 12, 8);
		Employee e2 = new Employee("Olya", 10, 8);
		Employee e3 = new Employee("Oleg", 5, 8);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(Employee.getCount());
		System.out.println(Employee.getTotalSum());  // return 0.0?
		
		e1.setHours(10);
		System.out.println(e1);
		
		

	}

}
