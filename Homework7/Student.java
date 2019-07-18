import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private int course;

	public static void printStudents(List<Student> students, int course) {
		Iterator<Student> iterator = students.iterator();
		List<Student> result = new ArrayList<>();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			if (student.getCourse() == (course)) {
				result.add(student);
			}
		}
		System.out.println("Students of the course " + result);

	}

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (course != other.course)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
