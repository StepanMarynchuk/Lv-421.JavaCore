package less6;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public String voice() {
		return "Gav";
	}

	@Override
	public String feed() {
		return "Purina";
	}

	@Override
	public String toString() {
		return "Dog [ "+ name +" ]";
	}
	
}
		


