package homework8;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {

	public static void main(String[] args) {
		// declare List students and add to the list five different students

		List<Student> students = new ArrayList<>();
		students.add(new Student("Stepan", 1));
		students.add(new Student("Marta", 2));
		students.add(new Student("Yarema", 3));
		students.add(new Student("Oleh", 4));
		students.add(new Student("Kristina", 3));

		// display the list of students ordered by name
		
		System.out.println( "list of students ordered by name:");
		
		students.sort(new NameComparator());
		for (Student s : students) {
			System.out.println(s.getName());
			
		}
		
		System.out.println( "list of students ordered by course:");
		
		// display the list of students ordered by course
		
		students.sort(new CourseComparator());
		for (Student st : students) {
			System.out.println(st.getName() +" "+ "coure:"+ " "+st.getCourse());
		}
		
		Student.printStudents(students, 3);
	}

}