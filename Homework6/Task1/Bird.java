
public abstract class Bird {
	protected String feathers;
	protected String layEggs;
	abstract void fly();
	public String getFeathers() {
		return feathers;
	}
	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}
	public String getLayEggs() {
		return layEggs;
	}
	public void setLayEggs(String layEggs) {
		this.layEggs = layEggs;
	}

}
