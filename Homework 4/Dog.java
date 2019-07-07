package home.task;

public class Dog {
	
	private String name;
	private int age;
	private Breed breed;
	 
	public enum Breed {
		
		Buldog, Spaniel, Terrier
		
	}
	
	
	public Dog(String name, Breed breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Breed getBreed() {
		return breed;
	}
	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog : name=" + name + ", breed=" + breed;
	}
	public static Dog OldestDog (Dog t1, Dog t2) {
		return t1.getAge() > t2.getAge() ? t1 : t2;
}
}
