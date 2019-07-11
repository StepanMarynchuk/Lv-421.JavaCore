
public class Main {

	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		for (int i = 0; i < emp.length; i++) {
			if (i % 2 == 0) {
				emp[i] = new SalariedEmployee(1 + i, "John" + i);
			} else {
				emp[i] = new ContractEmployee(10 + i, "Bill" + i);
			}
		}
		Employee tmp;
		for (int i = 0; i < emp.length; i++)
			for (int j = 0; j < emp.length; j++) {
				if(emp[i].calculatePay(8)>emp[j].calculatePay(8)){
					tmp=emp[i];
					emp[i]=emp[j];
					emp[j]=tmp;
				}
			}
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]+" salary "+emp[i].calculatePay(8));
		}
	}

}
