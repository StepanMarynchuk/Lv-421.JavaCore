package hometask;

public class Penguin extends NonFlyingBird {
	private String feathers;
	@Override
	public String toString() {
		return "Penguin [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}

	private String layEggs;

	public Penguin(String feathers, String layEggs) {
		
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public void getFly() {
		System.out.println("This bird isn't flying");

	}
}
