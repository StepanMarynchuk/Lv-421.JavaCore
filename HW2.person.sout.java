import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Dt {
    public static void main(String[] args) throws IOException {

        Person person1 = new Person("Nata", "Worex");
        Person person2 = new Person("Marry", "Ïvanovich");
        Person person3 = new Person("Sergii", "Join");
        Person person4 = new Person("Halyna", "Radis");
        Person person5 = new Person("Genry", "Forbs");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ïnput " + person1.getFirstName() + "'s year of birth " );
        person1.setBirthYear(Integer.parseInt(br.readLine()));
        System.out.println("ïnput " + person2.getFirstName() + "'s year of birth " );
        person2.setBirthYear(Integer.parseInt(br.readLine()));
        System.out.println("ïnput " + person3.getFirstName() + "'s year of birth " );
        person3.setBirthYear(Integer.parseInt(br.readLine()));
        System.out.println("ïnput " + person4.getFirstName() + "'s year of birth " );
        person4.setBirthYear(Integer.parseInt(br.readLine()));
        System.out.println("ïnput " + person5.getFirstName() + "'s year of birth " );
        person5.setBirthYear(Integer.parseInt(br.readLine()));
        System.out.println(person1.getFirstName() +" "+ person1.getLastName() +  " is " + person1.getAge(2019) + " years old.");
        System.out.println(person2.getFirstName() +" "+ person2.getLastName() + " is " + person2.getAge(2019) + " years old. ");
        System.out.println(person3.getFirstName() +" "+ person3.getLastName() + " is " + person3.getAge(2019) + " years old. ");
        System.out.println(person4.getFirstName() +" "+ person4.getLastName() + " is " + person4.getAge(2019) + " years old. ");
        System.out.println(person5.getFirstName() +" "+ person5.getLastName() + " is " + person5.getAge(2019) + " years old. ");


    }
}
