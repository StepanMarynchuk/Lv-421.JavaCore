package less.ons10;

public class Task1 {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);

				System.out.println("I study Java");
			}

		} catch (InterruptedException e) {

		}
	}
}
