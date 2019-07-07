package home.task;

import home.task.Dog.Breed;

public class DogType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog t1 = new Dog("Bob", Breed.Terrier, 5);
		Dog t2 = new Dog("Bob", Breed.Buldog, 2);
		Dog t3 = new Dog("Ben", Breed.Spaniel, 3);

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);

		if (t1.getName() == t2.getName() || t1.getName() == t3.getName() || t2.getName() == t3.getName()) {
			System.out.println("there is two dogs with the same name");
		} else {
			System.out.println("there is no two dogs with the same name");
		}

		System.out.println("The oldest dog is" + " - "+Dog.OldestDog(t1, Dog.OldestDog(t2, t3)));
	}

}
