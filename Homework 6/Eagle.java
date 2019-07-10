package hometask;

public class Eagle extends FlyingBird {

	private String feathers;
	private String layEggs;

	@Override
	public String toString() {
		return "Eagle [feathers=" + feathers+ ", layEggs=" + layEggs + "]";
	}

	public Eagle(String feathers, String layEggs) {
		this.feathers=feathers;
		this.layEggs=layEggs;
	}

	public void getFly() {
		System.out.println("This bird is flying");
	}

}
