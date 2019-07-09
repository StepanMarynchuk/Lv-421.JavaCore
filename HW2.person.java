import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    /*Add class Person to the project.
Class Person should consist of
two private fields: firstName, lastName and birthYear (the birthday year)
properties for access to these fields
default constructor and constructor with 2 parameters
methods:
getAge() - to calculate the age of person
Input() - to input information about person
output() - to output information about person
changeName(String fn, String fn) - to change the first name or/and last name of person
In the method main() create 5 objects of Person type and input information about them.*/
    private String firstName;
    private String lastName;
    private int birthYear;
    public int currentYear;


    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge(int currentYear) {
        return currentYear - getBirthYear();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void changeFirsName(String firstName) {
        if (this.firstName != firstName) {
            setFirstName(firstName);
        }
    }

    public void changeLastName(String lastName) {
        if (this.lastName != lastName) {
            setLastName(lastName);
        }
    }

   /* public void enterFirstName() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input your first name, please");
        setFirstName(br.readLine());
       /* чи можна активувати цей метод, щоб в класі Дт не писати кожного разу "Input..."
    }*/

}

