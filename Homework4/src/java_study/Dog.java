package java_study;

public class Dog {
	private String name;
	private int age;
	private Breed breed;

	public void samenames(Dog dog) {
		if (this == dog)
			System.out.println("Same dogs");
		if (dog == null)
			System.out.println("Not such dog");
		if (name.equals(dog.name)) {
			System.out.println("Same names");
		} else {
			System.out.println("Different names");
		}
	}

	static public void theoldest(Dog[] dog) {
		Dog check = dog[0];
		for (int i = 0; i < dog.length; i++) {
			if (dog[i].getAge() > check.getAge()) {
				check = dog[i];
			}
		}
		System.out.println("The oldest dog " + check.getName() + check.getBreed());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
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
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (breed != other.breed)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Dog(String name, int age, Breed breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
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

	public Breed getBreed() {
		return breed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}

}
