package hometask;

public class Chicken extends NonFlyingBird {

	private String feathers;
	@Override
	public String toString() {
		return "Chicken [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}

	private String layEggs;

	public Chicken(String feathers, String layEggs) {
		
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public void getFly() {
		System.out.println("This bird isn't flying");
	}
}
