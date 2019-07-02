import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberWeek {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter day of the week (1,2,3,4,5,6,7):");
		String input = br.readLine();
		switch (input) {
		case "1":
			System.out.println("Monday, понеділок");
			break;
		case "2":
			System.out.println("Tuesday, вівторок");

		}

	}

}
