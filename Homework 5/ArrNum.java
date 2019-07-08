package hometask;

public class ArrNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Numbers = { 5, -2, 6, 4, -5 };
		int sp = 0;
		for (int i = 0; i < 5; i++) {
			if (Numbers[i] > 0) {
				sp++;
				if (sp == 2) {
					System.out.println(
							"Second positive number is" + "-" + Numbers[i] + " " + "with position" + " " + (i + 1));

					int min = Numbers[0];
					int imin = 0;
					i = 0;

					for (int i1 = 0; i1 < 5; i1++) {
						if (Numbers[i1] < min) {
							min = Numbers[i1];
							imin = i1;
						}
						i1++;
					}
					System.out.print("Min = " + min);
					System.out.println(" is in " + (imin + 1) + " place");

				}

			}
		}
	}
}
