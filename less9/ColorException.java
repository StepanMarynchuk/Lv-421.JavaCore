package less9;

public class ColorException extends Exception{
	public ColorException (String msg) {
		super (msg);
	}
	public ColorException () {
		super ("no such color");
	}

}
