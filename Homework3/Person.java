import java.util.Calendar;

public class Person {
private String firstName;
private  String lastName;
private int birthYear;
private int age;

public void calculateAge(){
    setAge(Calendar.getInstance().get(Calendar.YEAR) - birthYear);
}

public void Input(String name,String surname,int birth){
    setFirstName(name);
    setLastName(surname);
    setBirthYer(birth);
    calculateAge();
}

public void output(){
        System.out.println( "Person{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", birthYer=" + getBirthYer() +
                ", age=" + getAge() +
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

    public int getBirthYer() {
        return birthYear;
    }

    public void setBirthYer(int birthYer) {
        this.birthYear = birthYer;
    }
    

    public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public Person() {
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        calculateAge();
    }

	
}