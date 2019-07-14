package less6;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public String voice() {
		return "Niav";
	}

	@Override
	public String feed() {
		return "Viskas";
	}	
	
	@Override
	public String toString() {
		return "Cat [ "+ name +" ]";
	}
}
