package homework8;

import java.util.Comparator;

public class NameComparator implements Comparator <Student> {

	public int compare(Student o1, Student o2) {
		return ((Student) o1).getName().compareTo(((Student) o2).getName());
	}
}
