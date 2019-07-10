
public class AnimalType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] a = new Animal[2];
		a[0] = new Cat();
		a[1] = new Dog();
		for (int i = 0; i < a.length; i++) {
			a[i].getFeed();
			a[i].getVoice();
		}
	}

}
