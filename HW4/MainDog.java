package homework4;

public class MainDog {
	
public static void main(String[] args) {
	Dog dog1 = new Dog("Palkan", "Bulldog", 5);
	Dog dog2 = new Dog("Brovko", "Spaniel", 2);
	Dog dog3 = new Dog("Lucky", "Labrador", 8);

	if (dog1.getName() == dog2.getName() || dog1.getName() == dog3.getName() || dog2.getName() == dog3.getName()) {
		System.out.println("there is dogs with the same name");
	} else {
		System.out.println("There is no dogs with the same name");
	}
		
	System.out.println("The oldest dog is: " + Dog.OldDog(dog1, Dog.OldDog(dog2, dog3)));
	
	
}
	
}
