
public class SalariedEmployee extends Employee implements Payment {

	private int socialSecurityNumber;

	@Override
	public double calculatePay(int hours) {
	 return getFixedpayment();
	}

	public SalariedEmployee(int number, String name) {
		super();
		setSocialSecurityNumber(number);
		setName(name);

	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [employeeId=" + employeeId
				+ ", name=" + name + ", getSocialSecurityNumber()=" + getSocialSecurityNumber() +"]";
	}

}
