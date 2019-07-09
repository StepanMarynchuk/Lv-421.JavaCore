package Cont;
import java.io.BufferedReader;
import java.io.IOException;

public class Car {
	private String type;
	private int year;
	private int capacity;

	static void showmodelyear(Car[] cars, BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Enter year");
		int year = Integer.parseInt(br.readLine());
		for (int i = 0; i < cars.length; i++) {
			if (year == cars[i].getYear()) {
				System.out.println(cars[i]);
			}
		}
		System.out.println("----------------------------");
	}

	static void orderbyyear(Car[] cars) {
		Car tmp = cars[0];
		for (int i = 0; i < cars.length - 1; i++)
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getYear() < cars[j].getYear()) {
					tmp = cars[i];
					cars[i] = cars[j];
					cars[j] = tmp;
				}
			}
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);

		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (capacity != other.capacity)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", capacity=" + capacity + "]";
	}

	public Car(String type, int year, int capacity) {
		this.type = type;
		this.year = year;
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}