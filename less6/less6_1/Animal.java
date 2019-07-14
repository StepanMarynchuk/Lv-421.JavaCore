package less6;
public abstract class Animal{
	protected String name;

	
	public Animal (String name) {
		this.name = name;
	}
	
	public abstract String voice ();
	public abstract String feed ();

}