package less3;


public class Person {
	
	private String firstName;
	private String lastName;
	private int birthYer;
	private int seqNumber;
	private static int number;

	
	public Person(String firstName, String lastName, int birthYer) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYer = birthYer;
		number++;
		seqNumber = number;
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		number++;
		seqNumber = number;
	}
	public Person() {
		number++;
		seqNumber = number;
	} 

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYer() {
		return birthYer;
	}

	public void setBirthYer(int birthYer) {
		this.birthYer = birthYer;
	}
	
	public int getAge() {
		return 2019 - birthYer;
	}
	
	public void input(String firstName, String lastName, int birthYer ) {
		setFirstName(firstName);
		setLastName(lastName);
		setBirthYer(birthYer);	
	}
	
	public void output() {
		System.out.println(toString()); 
		
	}
	
	public void changeName(String firstName, String lastName){
		setFirstName(firstName);
		setLastName(lastName);
	}

	@Override
	public String toString() {
		return seqNumber + " Person [firstName = " + firstName + ", lastName = " + lastName + ", birthYer = " + birthYer + "]";
	}

}
