package finalproject;

public class Wine {
	
	private int year;
    private String country;
	private String name;
	private double priceForLiter;
	private double volume;
	private Type type;
	
	public enum Type {
		Dry, Sweet, SemiDry, SemiSweet
	}

	
	public Wine(int year, String country, String name, double priceForLiter, double volume, Type type) {
		super();
		this.year = year;
		this.country = country;
		this.name = name;
		this.priceForLiter = priceForLiter;
		this.volume = volume;
		this.type = type;
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


	public double getPriceForLiter() {
		return priceForLiter;
	}


	public void setPriceForLiter(double priceForLiter) {
		this.priceForLiter = priceForLiter;
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
		return "Wine [year=" + year + ", country=" + country + ", name=" + name + ", priceForLiter=" + priceForLiter
				+ ", volume=" + volume + ", type=" + type + "]";
	}
}
