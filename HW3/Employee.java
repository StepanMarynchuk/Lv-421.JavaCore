public class Employee {
	private static double sum = 0;
	private static int count = 0;

	private String name;
	private int rate;
	private int hours;
	private int salary;
	private double bonuses;
	private double sumPerWorker;

	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		count++;
	}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
		count++;
	}

	public Employee(String name) {
		this.name = name;
		count++;
	} 															// constructors

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}


		
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + ", salary=" + getSalary() + ", bonuses="
				+ getBonuses() + ", sumPerWorker=" + getSumPerWorker() + "]";
	}

	private int getSalary() {
		return rate * hours;
	}

	public static int getCount() {
		return count;
	}

	public double getBonuses() {
		return getSalary() * 0.10;
	}
	
	public double getSumPerWorker() {
		return getSalary() + getBonuses();
	}

	public void setSumPerWorker(double sumPerWorker) {
		this.sumPerWorker = sumPerWorker;
		sum = sum + sumPerWorker;
	}
	
	public static double getTotalSum() {
		return sum*count;
	}

	

}
