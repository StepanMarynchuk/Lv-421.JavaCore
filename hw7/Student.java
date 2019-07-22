package homeWork7;

import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private int course;
	
	public Student(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}

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
		return "Student " + name + ", course - " + course;
	}

	public static void printStudents (List <Student> students, int course) {
		for (Iterator<Student> iterator = students.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			if(student.getCourse()==course) System.out.println(student);
		}
	}
	
}

