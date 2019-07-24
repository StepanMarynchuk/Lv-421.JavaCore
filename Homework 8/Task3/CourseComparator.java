package homework8;

import java.util.Comparator;

public class CourseComparator implements Comparator <Student> {
	  
	public int compare(Student o1, Student o2) {
		    return ((Student)o1).getCourse() - ((Student)o2).getCourse();
		  }}



