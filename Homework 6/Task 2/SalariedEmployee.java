package homework6;

public class SalariedEmployee extends Employee implements PayEmp {

	private String name;
	private int socialSecurityNumber = getEmployeeld();
	private int hourlyRate;
	private int hoursNumber;

	public SalariedEmployee(String name, int socialSecurityNumber, int hourlyRate, int hoursNumber) {
		super();
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.hoursNumber = hoursNumber;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHoursNumber() {
		return hoursNumber;
	}

	public void setHoursNumber(int hoursNumber) {
		this.hoursNumber = hoursNumber;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [name=" + name + ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}

	@Override
	public int calculatePay() {
		int salary= hourlyRate * hoursNumber;
		return salary;

	}
}
