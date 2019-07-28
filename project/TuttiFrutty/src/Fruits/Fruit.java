/*
1) Create a Class Fruit that contains:
+ field name and color
+ define the constructor with the parameters,
+ input () and print () methods for reading data from the console
    and outputting data to the console,
+ properties for fields,
+ redefine the toString () method.
 */


public class Fruit {
	private String name; // name of the fruit
	private String color; // color of the fruit

	// 	constructor with parameters
	Fruit(String n, String c) {
		name = n;
		color = c;

	}

	// constructor
	Fruit() {
		name = "";
		color = "";

	}

	// Constructor for copying an object
	Fruit(Fruit ob) { // object transfer to the constructor
		name = ob.name;
		color = ob.color;

	}

	// method input()
	public void input(String n, String c) {
		name = n;
		color = c;
	}

	// method print()
	public void print() {
		System.out.println(toString());
	}

	// method print()

	public void print(String path) {
		System.out.println("Fruit\nName: " + name + "\nColor: " + color);
	}
	// method input()

	public void input(String path) {

	}

	// method toString()
	public String toString() {
		return "Fruit: " + " " + name + "(" + color + ")";
	}

}
