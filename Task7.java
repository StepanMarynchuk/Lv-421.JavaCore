import java.io.BufferedReader;
import java.io.IOException;

public class Task7 {
	public static void task7 (BufferedReader br) throws IOException {
		System.out.println("Enter number n:");
		int n = Integer.parseInt(br.readLine());
		for (int i = (n-1); i > 0; i--) {
			n *= i;
		}
		System.out.println("n!  =   " + n);
	}
}
