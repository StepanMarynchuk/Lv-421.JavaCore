package homework6;

public class ListEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] e = new Employee[4];
		e[0] = new SalariedEmployee("Stepan", 9, 1000, 200);
		e[1] = new ContractEmployee("Marta", 10, 20000);
		e[2] = new SalariedEmployee("Yarema", 11, 1500, 200);
		e[3] = new ContractEmployee("Anna", 12, 28000);

		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
			System.out.println("Salary:" + e[i].calculatePay());
			// „им можливий такий вар≥ант , щоб вивести ≥нфу? (пробував, виходило-
			// null200000) System.out.println(e[i].getName()+ e[i].getSalary());
		}
		Employee sort;

		for (int i = 0; i < e.length - 1; i++) {
			for (int j = i + 1; j < e.length; j++) {
				if (e[i].calculatePay() < e[j].calculatePay())
					;
				{
					sort = e[i];
					e[i] = e[j];
					e[j] = sort;
				}
			}
		}
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
			//„омусь не сортуЇ у розр≥з≥ з/п, т≥льки ID. 
		}
	}

}
