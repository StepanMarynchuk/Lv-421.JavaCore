package hometask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	
	private String firstName;
	private String lastName;
	private int birthYear;
	private int today=2019;
	
	public Person () {
		
	}
	
	public Person (String firstName, String lastName, int birthYear) {
		this.birthYear=birthYear;
		this.firstName=firstName;
		this.lastName=lastName;
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
	
	public int getAge () {
		return today - birthYear;
	}
	
	
	public void changeFirsName(String firstName) {
        if (this.firstName != firstName) {
            setFirstName(firstName);}
        
        }



	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + "]";
	}
	
	public void newPerson () throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Input newFirstName:");
    	String newFirstName = br.readLine();
    	setFirstName(newFirstName);
    	System.out.println("Input newLastName:");
    	String newLastName = br.readLine();
    	setLastName(newLastName);
    	System.out.println("Input newBirthYear:");
    	int newBirthYear = Integer.parseInt(br.readLine());
    	setBirthYear(newBirthYear);}
	}
