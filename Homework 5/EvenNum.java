package hometask;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int product = 1;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements in array:");
		n = s.nextInt();

		int[] Numbers = new int[n];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			Numbers[i] = s.nextInt();
			if (Numbers[i] < 0) {
				break;
			}
		}
		for (int i = 0; i < n; i++) {
			if (Numbers[i] % 2 == 0 && Numbers[i] > 0) {
				product = product * Numbers[i];
			}
		}

		System.out.println("Product of Even Numbers:" + product);

	}
}
