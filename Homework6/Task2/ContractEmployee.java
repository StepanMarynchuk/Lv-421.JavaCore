
public class ContractEmployee extends Employee implements Payment {

	private int federalTaxIdmember;
	@Override
	public double calculatePay(int hours) {
		double result =getHourlyrate()*hours;
		return result;
	}

	public ContractEmployee(int number, String name) {
		super();
		setName(name);
		setFederalTaxIdmember(number);
		// TODO Auto-generated constructor stub
	}
	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdmember=" + federalTaxIdmember + ", employeeId=" + employeeId + ", name="
				+ name + ", getFederalTaxIdmember()=" + getFederalTaxIdmember() +  "salary = "+"]";
	}

}
