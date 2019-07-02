package com.softserve;


import java.time.LocalDate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;


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

    public int getAge() {
        LocalDate date = LocalDate.now ();
        if (birthYear > 0)
            return (date.getYear () - birthYear);
        else
            return 0;
    }

    public void Input() throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter your first name:");
        setFirstName (br.readLine ());
        System.out.println ("Enter your last name:");
        setLastName (br.readLine ());
        System.out.println ("Enter your birth year:");
        setBirthYear (Integer.parseInt (br.readLine ()));

    }


    public void output() {
        System.out.println ("Person{" +
                "firstName='" + getFirstName () + '\'' +
                ", lastName='" + getLastName () + '\'' +
                ", birthYear=" + getBirthYear () +
                ", age=" + getAge () +
                '}'
        );

    }


    public void changeName(String firstName, String lastName) {
        if (firstName != null) {
            setFirstName (firstName);
        }else {
            setLastName (lastName);

        }
    }
}
