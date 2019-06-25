public class Student {
	private static int sum=0;
	private static int count =0;
	
	private String name;
	private int age;
	private int rate;
	
	
	
	public Student() {count++;}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
	}
	
	public Student(String name) {
		this.name = name;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		sum = sum - this.rate;
		this.rate = rate;
		sum = sum + rate;
	}

	@Override
	public String toString() {
		return "Student (name=" + name + ", age=" + age + ")";
	}
	
	public static double getAvg() {
		return sum/(double)count;
	}
	
	public boolean betterStudent(Student s) {
		return this.rate >= s.getRate();
	}
	

}
