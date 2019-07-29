import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input two numbers");
		try {
			double a = Double.parseDouble(br.readLine());
			double b = Double.parseDouble(br.readLine());
			System.out.println(div(a, b));
		} catch (IOException | NumberFormatException | ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());

			System.out.println(div(a, b));
		} catch (NumberFormatException | IOException | NullPointerException e) {

		}
		
		System.out.println("Input Range");
		int rangeStart = 0;
		int rangeEnd = 100;
		System.out.println("Enter 10 int numbers what is in the range " + rangeStart +"-" + rangeEnd);
		for (int i = 0; i<10;) {
			System.out.println("Enter the " + (i+1) + " number");
			try {
				System.out.println(readNumber(rangeStart, rangeEnd, br));
				i++;
			} catch (NumberFormatException | IOException e) {
				System.err.println(e.getMessage());
				}
		}
	}

	static private double div(double a, double b) throws NullPointerException {

if (b != 0) {return a / b;}
throw new NullPointerException("second number is zero");

	}

	static private int readNumber(int start, int end, BufferedReader br) throws NumberFormatException, IOException {
		int res = Integer.parseInt(br.readLine());
		if (res > start && res < end)
			return res;

		else
			throw new NumberFormatException();

	}

}


