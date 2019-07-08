import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Car[] cars = new Car[4];
		for (int i = 0; i < 4; i++) {
			cars[i] = new Car("model" + i, 2000 + i, 390 + i * 10);
		}
		Car.showmodelyear(cars, br);
		Car.orderbyyear(cars);
		task1(br);
		task2(br);
		task3(5, br);

	}

	private static void task1(BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Input the number of month");
		int choice = Integer.parseInt(br.readLine());
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < month.length; i++) {
			if (choice == (i + 1)) {
				System.out.println("Days in month " + month[i]);
			}
		}
	}

	private static void task2(BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Enter 10 int numbers");
		int sum = 0;
		int product = 1;
		boolean check = false;
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < numbers.length; i++) {
			if ((i < 5) && (numbers[i] < 0)) {
				check = true;
			}
			if (check && i > 5) {
				product *= numbers[i];
			} else if (i < 5 && !check) {
				sum += numbers[i];
			}
		}
		System.out.println("Result = " + sum + " " + product);
	}

	private static void task3(int n, BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Enter " + n + " int numbers");
		int min;
		int sum = 0;
		int product = 1;
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			if (numbers[i] < 0) {
				System.out.println("Negative number");
				break;
			}
			if (numbers[i] % 2 == 0) {
				product *= numbers[i];
			}
		}

		System.out.println("Product = " + product);
		min = numbers[0];
		int index = 0;
		int position = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
				index = i;
			}
			if (numbers[i] > 0) {
				position++;
			}
			if (position == 2) {
				System.out.println("Second positive = " + numbers[i] + " position " + (i + 1));
			}
		}
		System.out.println("Min and position = " + min + " position " + (index + 1));
	}

}
