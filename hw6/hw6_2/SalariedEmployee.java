package homeWork6_1;

public class SalariedEmployee extends Employee{
	private int socialSecurityNumber;
	private int rate;
	private int hours;

	public SalariedEmployee(int employeeId, String name, int socialSecurityNumber, int rate, int hours) {
		super(employeeId, name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.rate = rate;
		this.hours = hours;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
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
	public int calculatePay() {
		return (rate*hours);
	}

	@Override
	public String toString() {
		return "SalariedEmployee [socialSecurityNumber=" + socialSecurityNumber + 
				" name=" +super.getName()+ " ID=" + super.getEmployeeId()+ 
				" salary=" + calculatePay()+"]";
	}


	

}
