
public class Cleaner extends Staff {
	private int daycount;
	private int amount;
	private String name;

	public Cleaner(String name, int daycount, int amount) {
		this.daycount = 6;
		this.amount = 400;
		this.setName(name);
	}

	public int getSalary() {
		return daycount * amount;
	}

	public void getPrint() {
		System.out.println("I am a cleaner");

	}

}
