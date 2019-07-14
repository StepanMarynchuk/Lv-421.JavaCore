package less6;

public class Teacher extends Staff{
	public Teacher(String name) {
		super(name);
	}

	private final String TUPE_PERSON = "Teacher";

	public String getTUPE_PERSON() {
		return TUPE_PERSON;
	}

	@Override
	public int salary() {
		return 100;
	}

	@Override
	public String print() {
		return "I am a " + name;
	}

}
