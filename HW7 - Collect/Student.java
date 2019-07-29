import java.util.ArrayList;
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
		return "Student [name=" + name + ", course=" + course + "]";
	}

	public static void printStudents(List<Student> students, Integer course) {

		Iterator<Student> it = students.iterator();

		List<Student> allStudents = new ArrayList<Student>();

		while (it.hasNext()) {
			Student student = (Student) it.next();
			if (student.getCourse() == (course)) {
				allStudents.add(student);

			}

		}
		System.out.println("Names of the students from the list" + "- " + allStudents);
	}
}