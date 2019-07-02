
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 6;
		int c = 2;
		int d = 9;
		int count = 0;

		if (a % 2 != 0) {
			System.out.println(count++);
		}

		if (b % 2 != 0) {
			System.out.println(count++);
		}
		if (c % 2 != 0) {
			System.out.println(count++);
		}

		if (d % 2 != 0) {
			System.out.println(count++);
		}

		System.out.println("Odd:" + count);
	}
}
