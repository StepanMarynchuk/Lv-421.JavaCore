package less6;

public class Cleaner extends Staff  {
	public Cleaner(String name) {
		super(name);
	}

	private final String TUPE_PERSON = "Cleaner";

	public String getTUPE_PERSON() {
		return TUPE_PERSON;
	}

	@Override
	public int salary() {
		return 150;
	}

	@Override
	public String print() {
		return "I am a " + name;
	}
}
