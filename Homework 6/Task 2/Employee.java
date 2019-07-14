package homework6;

public abstract class Employee implements PayEmp {

	private int employeeld;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(int employeeld) {
		this.employeeld = employeeld;
	}

}
