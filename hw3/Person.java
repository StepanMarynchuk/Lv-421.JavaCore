package less3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {
	
	private String firstName;
	private String lastName;
	private int birthYear;
	private int seqNumber;
	private static int number;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public Person(String firstName, String lastName, int birthYer) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYer;
		seqNumber = ++number;
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		seqNumber = ++number;
	}
	
	public Person() {
		seqNumber = ++number;
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
		return birthYear;
	}

	public void setBirthYer(int birthYer) {
		this.birthYear = birthYer;
	}
	
	public int getAge() {
		LocalDate date =  LocalDate.now();
		if (birthYear != 0)
			return (date.getYear() - birthYear);
		else
			return 0;
	}
	
	public void input() throws IOException  {
		System.out.println("Enter First Name:");
		setFirstName(br.readLine());
		System.out.println("Enter Last Name:");
		setLastName(br.readLine());
		System.out.println("Enter Birth Year:");
		setBirthYer(Integer.parseInt(br.readLine()));	
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
		return seqNumber + " Person [firstName = " + firstName + ", lastName = " + lastName + ", birthYear = " + birthYear +", Age = " + getAge() + "]";
	}

}
