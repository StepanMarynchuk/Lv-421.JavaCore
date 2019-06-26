package hometask;

public class Employee {
	
	private static int sum=0;
	private static int sum2 =0;
	private static int count =0;
	
	
	private String name;
	private int rate;
	private int hour;
	

	public Employee() { 
		count++;
		}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
		count++;
		}
	
	
	public Employee(String name, int rate, int hour) {
		this.name = name;
		this.rate = rate;
		this.hour = hour;
		count++;
		}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
		sum=sum+ rate;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
		sum2=sum2+ hour;
	}


	public int getSalary() {
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


	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hour=" + hour + "]";
	}
	public static double getTotalSum () {
		return (((int)sum*sum2)/count)*1.1;
	}

	
}

