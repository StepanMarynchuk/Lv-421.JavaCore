package homeWork6_1;

public class MainEmloyee {

	public static void main(String[] args) {
		Employee [] employee = new Employee [6];
		employee[0]= new SalariedEmployee(1, "Andriy", 101, 5, 45);
		employee[1]= new SalariedEmployee(2, "Mykola", 102, 10, 15);
		employee[2]= new SalariedEmployee(3, "Vasia", 103, 8, 35);
		employee[3]= new ContractEmployee(4, "Stepan", 1001, 190);
		employee[4]= new ContractEmployee(5, "Petro", 1002, 160);
		employee[5]= new ContractEmployee(6, "Oleg", 1003, 260);
		
		Employee emp = employee[0];
		for (int i = 0; i < employee.length; i++) {
			for (int j = 0; j < employee.length; j++) {
				if (employee[i].calculatePay()<employee[j].calculatePay()) {
					emp = employee[i];
					employee[i]=employee[j];
					employee[j]=emp;
				}
			}		
		}
		
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);			
		}

	}

}
