package homeWork5;

public class Car {
	private String type;
	private int prodYear;
	private float engineCapacity;
	
	
	public Car(String type, int prodYear, float engineCapacity) {
		this.type = type;
		this.prodYear = prodYear;
		this.engineCapacity = engineCapacity;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getProdYear() {
		return prodYear;
	}


	public void setProdYear(int prodYear) {
		this.prodYear = prodYear;
	}


	public float getEngineCapacity() {
		return engineCapacity;
	}


	public void setEngineCapacity(float engineCapacity) {
		this.engineCapacity = engineCapacity;
	}


	@Override
	public String toString() {
		return "Car [type= " + type + ", prodYear= " + prodYear + ", engineCapacity= " + engineCapacity + "]";
	}
	

}
