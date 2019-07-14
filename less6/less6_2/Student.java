package less6;

public class Student extends Person{
	public Student(String name) {
		super(name);
	}

	private final String TUPE_PERSON = "Student";

	public String getTUPE_PERSON() {
		return TUPE_PERSON;
	}

	@Override
	public String print() {
		return "I am a " + name;
	}
	

}
