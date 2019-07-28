/*
			2) Create a derived class of Citrus, which has:
			+ field - the content of vitamin C in grams,
			+ constructor with parameters
			+ property
			- redefined methods input () and print ().
*/

public class Citrus extends Fruit {
	private double vitaminC; 
	// field - the content of vitamin C in grams
	// The constructor used when specifying all parameters
	Citrus(String n, String c, double vC) {
		super(n, c); // call the base constructor 
		if (vC < 0) {
			throw new NumberFormatException();
		} else {
			vitaminC = vC; // weight
		}

	}

	// method input()
	public void input(String n, String c, double vC) {
		super.input(n, c);// method from base class
		vitaminC = vC;
	}

	// method print()
	public void print() {
		System.out.println(toString());
	}

	// toString()
	public String toString() {
		return super.toString() // method from base class
				+ ", value of vitamin C->" + vitaminC;
	}
}
