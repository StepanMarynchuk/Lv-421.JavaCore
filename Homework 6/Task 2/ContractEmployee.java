package homework6;

public class ContractEmployee extends Employee implements PayEmp {

	private String name;
	private int federalTaxIdmember=getEmployeeld();
	private int fixedMonthlyPayment;

	public int getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	public ContractEmployee(String name, int federalTaxIdmember, int fixedMonthlyPayment) {
		super();
		this.name = name;
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}


	@Override
	public String toString() {
		return "ContractEmployee [name=" + name + ", federalTaxIdmember=" + federalTaxIdmember + "]";
	}

	@Override
	public int calculatePay () {
		return fixedMonthlyPayment;
}}
