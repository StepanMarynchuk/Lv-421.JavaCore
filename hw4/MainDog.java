package homeWork4;



public class MainDog {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Bobik", "Boxer", 3);
		Dog dog2 = new Dog("Bobik", "Shpitz", 6);
		Dog dog3 = new Dog("Wulkan", "Doberman", 1);
		
		if (dog1.equals(dog2)|dog2.equals(dog3)|dog3.equals(dog1)){
			System.out.println("Two dogs are the same name");
		} else {
			System.out.println("NO two dogs with the same name");
		}
		
		if (dog1.getAge()>=dog2.getAge()&&dog1.getAge()>=dog3.getAge()) {
			dog1.oldOutput();
		} else if (dog2.getAge()>=dog3.getAge()) {
			dog2.oldOutput();
		} else {
			dog3.oldOutput();
		}

		

	}

}
