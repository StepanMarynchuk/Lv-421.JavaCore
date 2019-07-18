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
///////////////////////////////////////////

		try {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			System.out.println(readNumber(a, b, br));

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
///////////////////////////////////////////
		int a = 1;
		int i =10;
		while(i!=0) {
			try {
				a =readNumber(a, 100, br);
				System.out.println(a);
				i--;
				
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
	}

	static private double div(double a, double b) {
		return a / b;
	}

	static private int readNumber(int start, int end, BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Input number in range");
		int res = Integer.parseInt(br.readLine());
		if (res > start && res < end)
			return res;

		else
			throw new NumberFormatException();

	}

}
