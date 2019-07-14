package homeWork6_1;

public class ContractEmployee extends Employee {
	private int federalTaxIdMember; 
	private int monthlyPayment;

	public ContractEmployee(int employeeId, String name, int federalTaxIdMember, int monthlyPayment) {
		super(employeeId, name);
		this.federalTaxIdMember = federalTaxIdMember;
		this.monthlyPayment = monthlyPayment;
	}
	
	public int getFederalTaxIdMember() {
		return federalTaxIdMember;
	}
	
	public void setFederalTaxIdMember(int federalTaxIdMember) {
		this.federalTaxIdMember = federalTaxIdMember;
	}
	
	public int getMonthlyPayment() {
		return monthlyPayment;
	}
	
	public void setMonthlyPayment(int monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	
	@Override
	public int calculatePay() {
		return monthlyPayment;
	}

	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdMember=" + federalTaxIdMember + 
				" name=" +super.getName()+ " ID=" + super.getEmployeeId() + 
				" salary=" + calculatePay()+"]";
	}
	

}
