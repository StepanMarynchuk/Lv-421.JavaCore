package com.softserve;
import java.util.*;


public class NameComporator implements Comparator<Student>{
        public int compare(Student s1,Student s2){
            return s1.name.compareTo(s2.name);
        }
    }
