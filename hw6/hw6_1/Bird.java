package homeWork6;

public abstract class Bird {
	private boolean feathers;
	private boolean layEggs;
	
	public Bird(boolean feathers, boolean layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public boolean getFeathers() {
		return feathers;
	}

	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}

	public boolean getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}
	
	public abstract boolean fly();
	public abstract String printName();

	@Override
	public String toString() {
		return " [feathers=" + feathers + ", layEggs=" + layEggs +"]";
	}

}
