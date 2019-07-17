package com.softserve;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        HashSet <String> set1 = new HashSet <String>();
        HashSet <String> set2 = new HashSet <String>(set1);
        set1.add("Warsaw");
        set1.add("Krakow");
        System.out.println("Set1 = "+ set1);

        set2.addAll (set1);
        System.out.println("Set2 = "+ set2);

        set1.retainAll(set2);
        System.out.println("Intersection = "+ set1);
            }

} 

