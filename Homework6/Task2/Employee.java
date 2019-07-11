
public abstract class Employee implements Payment {
	protected String employeeId;
	protected String name;
	protected int fixedpayment=500;
	protected int hourlyrate=25;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFixedpayment() {
		return fixedpayment;
	}
	public void setFixedpayment(int fixedpayment) {
		this.fixedpayment = fixedpayment;
	}
	public int getHourlyrate() {
		return hourlyrate;
	}
	public void setHourlyrate(int hourlyrate) {
		this.hourlyrate = hourlyrate;
	}
	
}
