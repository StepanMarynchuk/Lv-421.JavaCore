import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		NewEmployee[] emp = new NewEmployee[5];
		emp[0] = new NewEmployee("Stepan", 1, 1000);
		emp[1] = new NewEmployee("Vika", 2, 2000);
		emp[2] = new NewEmployee("Natalia", 3, 3000);
		emp[3] = new NewEmployee("Marta", 2, 4000);
		emp[4] = new NewEmployee("Anna", 1, 5000);

		for (NewEmployee e : emp) {
			System.out.println(e);

		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter department (1/2/3):");
		int dep = Integer.parseInt(br.readLine());

		System.out.println();

		for (NewEmployee e : emp) {
			if (e.getDepartment() == dep)

				System.out.println(e);
			System.out.println();
			NewEmployee sort;
			for (int i = 0; i < emp.length - 1; i++) {
				for (int j = i + 1; j < emp.length; j++) {
					if (emp[i].getSalary() < emp[j].getSalary()) {
						sort = emp[i];
						emp[i] = emp[j];
						emp[j] = sort;

					}
				}
			}
		}
		for (NewEmployee e1 : emp) {
			System.out.println(e1);
		}
	}
}
