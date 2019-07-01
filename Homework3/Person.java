import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {
private String firstName;
private  String lastName;
private int birthYear;


public int calculateAge(){
	LocalDate date = LocalDate.now();
    LocalDate year = date.minusYears(birthYear);
    return year.getYear();
}

public void Input() throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Input person`s name, surname and birth year");
	String name = br.readLine();
	String surname = br.readLine();
	int birth = Integer.parseInt(br.readLine());
    setFirstName(name);
    setLastName(surname);
    setBirthYear(birth);
}

public void output(){
        System.out.println( "Person{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", birthYear=" + getBirthYear() +
                ", age=" + calculateAge() +
                '}');

}

public void changeName(String name,String surname){
    if(surname == null){
    setFirstName(name);
    }
    else if(name == null){
    setLastName(surname);
    }
    else {setFirstName(name);
    setLastName(surname);
    }
}

  /////////////////////////////////////////////////////
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
	
	public Person() {
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
}