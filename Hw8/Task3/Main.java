package com.softserve;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();

        list.add(new Student ("Yana",137));
        list.add(new Student ("Yaroslav",139));
        list.add(new Student ("Emiliia",137));
        list.add(new Student ("Nazar",151));
        list.add(new Student ("Alisa",193));

        System.out.println("Sorting by Name:");

        Collections.sort(list,new NameComporator ());
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.name);
        }
        System.out.println("Sorting by CourseName:");

        Collections.sort(list,new CourseNameComporator ());
        Iterator itr2=list.iterator();
        while(itr2.hasNext()){
            Student st=(Student)itr2.next();
            System.out.println(st.courseName);

        }
        for(int i=0;i<list.size();i++) {

            System.out.println("Name:" + list.get(i).getName () + ',' + "CourseName:"+list.get(i).getCourseName ());

        }

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
