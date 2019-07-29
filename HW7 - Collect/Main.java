import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student("Mark", 5));
		students.add(new Student("Orisya", 3));
		students.add(new Student("David", 2));
		students.add(new Student("Dasha", 1));
		students.add(new Student("Ira", 3));

		System.out.println("list of students ordered by name:");

		students.sort(new NameComparator());
		for (Student s : students) {
			System.out.println(s.getName());

		}

		System.out.println("list of students ordered by course:");

		students.sort(new CourseComparator());
		for (Student st : students) {
			System.out.println(st.getName() + " " + "coure:" + " " + st.getCourse());
		}

		Student.printStudents(students, 3);
	}

}