
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet(10);
		Set<Integer> s2 = new HashSet(10);
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			s1.add(rand.nextInt(10));
			s2.add(rand.nextInt(10));
		}
		union(s1, s2);
		intersection(s1, s2);
		///////////////////////////////////////////
		Map<String, String> personMap = new HashMap<>();
		personMap.put(new Person("John", "Whick").getFirstname(), new Person("John", "Whick").getLastname());
		personMap.put(new Person<String, String>("John1", "Whick1").getFirstname(),
				new Person<String, String>("John1", "Whick1").getLastname());
		personMap.put(new Person<String, String>("John2", "Whick2").getFirstname(),
				new Person<String, String>("John2", "Whick2").getLastname());
		personMap.put(new Person<String, String>("John3", "Whick3").getFirstname(),
				new Person<String, String>("John3", "Whick3").getLastname());
		personMap.put(new Person<String, String>("John4", "Whick4").getFirstname(),
				new Person<String, String>("John4", "Whick4").getLastname());
		personMap.put(new Person<String, String>("John5", "Whick5").getFirstname(),
				new Person<String, String>("John5", "Whick5").getLastname());
		personMap.put(new Person<String, String>("John1", "Whick1").getFirstname(),
				new Person<String, String>("John1", "Whick1").getLastname());
		personMap.put(new Person<String, String>("John2", "Whick2").getFirstname(),
				new Person<String, String>("John2", "Whick2").getLastname());
		personMap.put(new Person<String, String>("John3", "Whick3").getFirstname(),
				new Person<String, String>("John3", "Whick3").getLastname());
		personMap.put(new Person<String, String>("John4", "Whick4").getFirstname(),
				new Person<String, String>("John4", "Whick4").getLastname());
		personMap.remove("John");
		personMap.forEach((key, value) -> System.out.println(key + ":" + value));
		////////////////////////////////////////////
		List<Student> students = new ArrayList<>();
		students.add(new Student("Vasya", 1));
		students.add(new Student("Dasha", 2));
		students.add(new Student("Sahsa", 3));
		students.add(new Student("Vania", 3));
		students.add(new Student("Pasha", 3));

		students.sort(new NameComparator());
		for (Student stud : students) {
			System.out.println(stud);
		}
		System.out.println();
		students.sort(new CourseComparator());
		for (Student stud : students) {
			System.out.println(stud);
		}

		Student.printStudents(students, 3);
	}

	static private void union(Set set1, Set set2) {
		Set<Integer> result = new HashSet(set1);
		result.addAll(set2);
		System.out.println("Union = " + result);
	}

	static private void intersection(Set set1, Set set2) {
		Set<Integer> result = new HashSet(set1);
		result.retainAll(set2);
		System.out.println("Intersection = " + result);
	}
}
