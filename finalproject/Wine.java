package finalproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Wine {

	private int year;
	private String country;
	private String name;
	private double price;
	private double volume;
	private Type type;

	public enum Type {
		DRY, SWEET, SEMIDRY, SEMISWEET
	}

	public Wine(int year, String country, String name, double price, double volume, String type) throws TypeException{
		super();
		Type t = typeStrToEnum (type);
		this.year = year;
		this.country = country;
		this.name = name;
		this.price = price;
		this.volume = volume;
		this.type = t;
	}
	
//	private Type typeStrToEnum(Type type2) {
//		// TODO Auto-generated method stub
//		return type2;
	//}

	private Type typeStrToEnum (String type) throws TypeException {
		switch(type.toUpperCase()){
		case "DRY": return Type.DRY;
		case "SWEET": return Type.SWEET;
		case "SEMIDRY": return Type.SEMIDRY;
		case "SEMISWEET": return Type.SEMISWEET;
		
		default : throw new TypeException("no type");
		}
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Wine [year=" + year + ", country=" + country + ", name=" + name + ", price=" + price
				+ ", volume=" + volume + ", type=" + type + "]";
	}

//	public static void printWine(List<Wine> wine, String type) {
//		List<Wine> result = new ArrayList<Wine>();
//		Iterator<Wine> it = wine.iterator();
//		while (it.hasNext()) {
//			Wine wines = (Wine) it.next();
//			if (wines.type == type) {
//				result.add(wines);
//			}
		//}
//		System.out.println("Dry wine: " +result);
	
}
