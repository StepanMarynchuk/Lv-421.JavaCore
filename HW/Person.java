package WorkHome2;
import java.util.Scanner;
public class Person {
private String FirstName;
private String LastName;
private String FavoriteColor;
int birthYear ;
int Age ;
int YearToday;

public Person(String firstName, String lastName) {
	super();
	FirstName = firstName;
	LastName = lastName;
	
}
public Person(String firstName, String lastName, String favoriteColor, int birthYear) {
	super();
	FirstName = firstName;
	LastName = lastName;
	FavoriteColor = favoriteColor;
	this.birthYear = birthYear;
}
public Person() {
	super();
}
public int getAge() {
	
	Scanner scan = new Scanner(System.in);
	int YearToday = scan.nextInt();
	Age = YearToday - birthYear;
	return Age;
}
public void setAge(int age) {
	Age = age;
}
@Override
public String toString() {
	return "Person [FirstName= " + FirstName + ", LastName= " + LastName + ", FavoriteColor= " + FavoriteColor + ", Age="
			+ Age + "]";
}

public String toString1() {
	return "Person [" + FirstName  +" "+ LastName +   "]";
}
	

}
