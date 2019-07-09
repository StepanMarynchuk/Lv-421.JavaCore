
public class Teacher extends Staff {
	private int daycount;
	private int amount;
	private String name;

	public Teacher(String name,  int daycount, int amount) {
		this.daycount = daycount;
		this.amount = amount;
		this.setName(name);
	}

	public int getSalary() {
		return daycount * amount;
	}

	public void getPrint() {
		System.out.println("I am a teacher");

	}

}
