
public class Student extends Person {
	private String name;
	static final String TYPE_PERSON = "Student";
	public Student(String name) {
		this.setName(name);
	}
	
	public void getPrint () {System.out.println("I am a " + TYPE_PERSON);}

	@Override
	public String toString() {
		return getName();
	}
}
