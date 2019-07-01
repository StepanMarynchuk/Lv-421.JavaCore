import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	public int birthYear;
	
	public int age;
	int year = Calendar.getInstance().get(Calendar.YEAR);
	
	public Person() {
	}
	
	public Person(String firstName, String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
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

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	
	public int getAge() {
		return year - birthYear;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void input() throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Pleae, enter your name, surname and birthday year");
		String name = br.readLine();
		String surname = br.readLine();
		int birth = Integer.parseInt(br.readLine());
		setFirstName(name);
		setLastName(surname);
		setBirthYear(birth);
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + ", age=" + getAge()
				+ "]";
	}
	
	public void output() {
		System.out.println("firstName = " + getFirstName());
		System.out.println("lastName = " + getLastName());
		System.out.println("birthYear = " + getBirthYear());
		System.out.println("birthYear = " + getAge());
	}


	
}
