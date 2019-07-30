package lastlessons;

public class Task12 {
	public static void main(String[] args) {
		// int n = 0;
		// Scanner s = new Scanner(System.in);
		//
		// System.out.print("Enter the number of elements in array:");
		// n = s.nextInt();
		//
		// int[] Numbers = new int[n];
		//
		// System.out.println("Enter the elements of the array:");
		// for (int i = 0; i < n; i++) {
		// Numbers[i] = s.nextInt();

		int sum = 0;

		int[] Numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		// if (Numbers[1] * Numbers[1] > 9) {
		// Numbers[1] = Numbers[1] * Numbers[1] - 9;
		// }
		// if (Numbers[3] * Numbers[3] > 9) {
		// Numbers[3] = Numbers[3] * Numbers[3] - 9;
		// }
		//
		// if (Numbers[5] * Numbers[5] > 9) {
		// Numbers[5] = Numbers[5] * Numbers[5] - 9;
		// }
		//
		// if (Numbers[7] * Numbers[7] > 9) {
		// Numbers[7] = Numbers[7] * Numbers[7] - 9;
		// }
		//
		// if (Numbers[9] * Numbers[9] > 9) {
		// Numbers[9] = Numbers[9] * Numbers[9] - 9;
		// }

		for (int i = 1; i < 10; i = i + 2) {
			{
				if (Numbers[i] * 2 > 9) {
					Numbers[i] = Numbers[i] * 2 - 9;
				}
				sum += Numbers[i];
			}

		}
			if (sum % 10 == 0) {
				System.out.println("number is correct");
			} else {
				System.out.println("number isn't correct");
			}
	}
}