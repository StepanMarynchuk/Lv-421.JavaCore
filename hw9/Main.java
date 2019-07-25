package homeWork9;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		System.out.println("------------part 1 (div 2 double numbers)--------------");
		try {
			System.out.println("Enter the double number 1: ");
			double a = MyInput.myInputDouble();
			System.out.println("Enter the double number 2: ");
			double b = MyInput.myInputDouble();
			System.out.println(div(a, b));
		} catch (NumberFormatException | IOException | NullPointerException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("------------part 2 (range 10 int numbers)--------------");
		int rangeStart = 1;
		int rangeEnd = 100;
		System.out.println("Enter 10 int numbers what is in the range" + rangeStart +"-" + rangeEnd);
		for (int i = 0; i<10;) {
			System.out.println("Enter the " + (i+1) + " number");
			try {
				System.out.println(readNumber(rangeStart, rangeEnd));
				i++;
			} catch (NumberFormatException | IOException | MyException e) {
				System.err.println(e.getMessage());
			} 
		}			
	}

	public static double div(double a, double b) throws NullPointerException {
		if (b != 0) {return a / b;}
		throw new NullPointerException("second namber is zero");
	}
	
	public static int readNumber (int rangeStart, int rangeEnd) 
			throws NumberFormatException, IOException, MyException {
		int number = MyInput.myInputInteger();
		if (rangeStart < number && number < rangeEnd) {
			return number;
		} throw new MyException();	
	}
}
