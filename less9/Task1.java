package less9;

public class Task1 {
	public static int  squareRectangle(int a, int b) throws ArithmeticException {
		if (a < 0 | b < 0)throw new ArithmeticException("a or b is below zero");
		 return a * b;
	}

	public static int trySquareRectangle(int a, int b)  throws ArithmeticException{
		return squareRectangle(a,b);
	}
}
