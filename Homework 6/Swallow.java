package hometask;

public class Swallow extends FlyingBird {
	private String feathers;
	private String layEggs;

	public Swallow(String feathers, String layEggs) {
		this.feathers=feathers;
		this.layEggs=layEggs;
	}

	public void getFly() {
		System.out.println("This bird is flying");}
		
		@Override
		public String toString() {
			return "Swallow [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}

}