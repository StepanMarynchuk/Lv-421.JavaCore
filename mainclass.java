package study;

public class mainclass {

	public static void main(String[] args) {
		Employee man = new Employee("Вася", 1500,28);
		System.out.println(man);
		Employee woman =  new Employee("Ірина",2500,42);
		System.out.println(woman);
		Employee dog = new Employee("Мухтар", 2188, 22);
		System.out.println(dog);
		System.out.println(man.getSalary());
		System.out.println(woman.getSalary());
		System.out.println(Employee.getRateAvg());
System.out.println(dog.getBonuses());		
System.out.println(man.getBonuses());	
System.out.println(woman.getBonuses());	
	}

}
