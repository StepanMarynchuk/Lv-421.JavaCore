
public class Employee {

	
	
	private static int count =0;
	
	private String name;
	private double rate;
	private double hour;

	public Employee () {count ++;}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public Employee() {

	}

	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, double rate, double hour) {
		this.name = name;
		this.rate = rate;
		this.hour = hour;

	}

	public double getSalary() {
		return hour * rate;
	}

	public void changeRate(int rate) {
		if (rate > 0) {
			setRate(rate);
		}
	}

	public double getBonuses() {
		return getSalary() * 0.1;
	}
		
	
	public static double totalSum() {return totalSum(); }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hour=" + hour + "]";
	}

}
