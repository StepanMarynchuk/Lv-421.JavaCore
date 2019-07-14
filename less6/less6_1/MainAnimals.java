package less6;

public class MainAnimals {

	public static void main(String[] args) {
		
		Animal [] animal = {new Dog("Bobik"),new Dog("Barbos"),
				new Cat("Murchik"),new Cat("Rydyi")};

		
		for (int i = 0; i < animal.length; i++) {
			System.out.println(animal[i] + "  feed - " + animal[i].feed() +  "  voice - " + animal[i].voice());
		}


	}

}
