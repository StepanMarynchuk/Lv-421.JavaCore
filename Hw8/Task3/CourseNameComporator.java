package com.softserve;
import java.util.*;

    public class CourseNameComporator implements Comparator{
        public int compare(Object o1,Object o2){
            Student s1=(Student)o1;
            Student s2=(Student)o2;

            if(s1.courseName==s2.courseName)
                return 0;
            else if(s1.courseName>s2.courseName)
                return 1;
            else
                return -1;
        }
    }

