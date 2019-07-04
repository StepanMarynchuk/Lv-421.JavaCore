
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, -3, 4, -5, 6, 7, 10, 9, 8 };

		int max = numbers[0];
		int imax = 0;
		int i = 0;

		while (i < numbers.length) {
			if (numbers[i] > max) {
				max = numbers[i];
				imax = i;
			}
			i++;
		}
		System.out.println("Maximum=" + " " + max + ", " + "is in" + " " + (imax + 1) + " " + "place");

		int sum = 0;

		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] > 0) {
				sum += numbers[j];
			}

		}

		System.out.println("Sum = " + sum);

		int amountN = 0;
		for (int a : numbers) {
			if (a < 0) {
				amountN++;

			}
		}

		System.out.println("Amount negative numbers =" + " " + amountN);

		int amountP = 0;
		for (int a : numbers) {
			if (a > 0) {
				amountP++;

			}
		}

		System.out.println("Amount positive numbers =" + " " + amountP);

		if (amountN > amountP) {
			System.out.println("more -");
		} else {
			System.out.println("more +");
		}
	}

}
