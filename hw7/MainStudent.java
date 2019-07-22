package homeWork7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainStudent {

	public static void main(String[] args) {
		List <Student> students = new ArrayList<Student>();
		students.add(new Student("Yura", 1));
		students.add(new Student("Mykola", 3));
		students.add(new Student("Petro", 1));
		students.add(new Student("Ivan", 2));
		students.add(new Student("Julia", 3));
		students.add(new Student("Viktoriya", 2));
		students.add(new Student("Oleg", 1));
		students.add(new Student("Andriy", 1));
		
		students.sort(new NameComparator());
		for (Iterator<Student> i = students.iterator(); i.hasNext();) {
			System.out.println(i.next());	
		}
		System.out.println("\ncourse 1 students:");
		Student.printStudents(students, 1);

	}

}
