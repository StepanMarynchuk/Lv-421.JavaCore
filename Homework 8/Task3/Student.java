package homework8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
	
	// Write class Student that provides information about the name of the student
	// and his course. Class Student should consist of

	private String name;
	private int course;

//b) constructor with parameters

	public Student(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}

//a) properties for access to these fields
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

//method printStudents (List students, Integer course), which receives a list of students and the 
//course number and prints to the console the names of the students from the list, which are taught in 
//this course (use an iterator)
	
	public static void printStudents(List<Student> students, Integer course) {

		Iterator<Student> it = students.iterator();
		List<Student> allStudents = new ArrayList<Student>();

		while (it.hasNext()) {
			Student student = (Student) it.next();
			if (student.getCourse() == (course)) {
				allStudents.add(student);
				
				System.out.println("Names of the students from the list" + "- " + allStudents);
			}

		}
	}
}
