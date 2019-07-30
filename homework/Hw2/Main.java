package com.softserve;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Person person1 = new Person ("Eva", "Becker", 1993);
        Person person2 = new Person ("Tony", "Kallas", 1986);
        Person person3 = new Person ("Sonia", "Miller", 1983);
        Person person4 = new Person ("Lindsey", "Wilson", 1995);
        Person person5 = new Person ();
        
        person5.Input();

        person1.output ();
        person2.output ();
        person3.output ();
        person4.output ();
        person5.output ();
    }
}
