package homeWork9;

public class MyException extends Exception{
	public MyException (String msg) {
		super (msg);
	}
	public MyException () {
		super ("number is not in the range");
	}

}
