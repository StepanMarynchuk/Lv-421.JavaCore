package hometask;

public class Car {

	private Type type;
	private int year;
	private double capacity;
	
public enum Type {
		
		Sedan, Hatchback, Crossover,Coupe
		
	}
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	public Car(Type type, int year, double capacity) {
		super();
		this.type = type;
		this.year = year;
		this.capacity = capacity;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", capacity=" + capacity + "]";
	}
	

}
