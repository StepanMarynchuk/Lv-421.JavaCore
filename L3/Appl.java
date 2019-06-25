
public class Appl {

	public static void main(String[] args) {

		Student s1 = new Student("Vasya", 20);
		s1.setRate(5);
		Student s2 = new Student("Vasya2", 21);
		s2.setRate(4);
		Student s3 = new Student("Vasya3", 19);
		s3.setRate(2);
		s3.setRate(5);
		s3.setRate(5);
		
		System.out.println(s1);
		System.out.println(Student.getAvg());
		System.out.println(s1.betterStudent(s3));
	}

}
