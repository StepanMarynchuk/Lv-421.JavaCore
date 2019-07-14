package less6;

public abstract class Person {
	protected String name;
	
	public Person(String name) {
		this.name = name;
	}
	protected abstract String print();
	protected abstract String getTUPE_PERSON();
}
