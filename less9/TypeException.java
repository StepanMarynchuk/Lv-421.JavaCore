package less9;

public class TypeException extends Exception{
	public TypeException (String msg) {
		super (msg);
	}
	public TypeException () {
		super ("no such type");
	}

}
