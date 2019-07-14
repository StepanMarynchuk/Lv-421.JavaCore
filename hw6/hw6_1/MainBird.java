package homeWork6;

public class MainBird {

	public static void main(String[] args) {
		
		Bird [] bird = {new Kiwi(false, true),new Eagle(true, true),
				new Penguin(false, true),new Swallow(true, true)};
		
		for (int i = 0; i < bird.length; i++) {
			System.out.println(bird[i].printName() + bird[i] + " fly - " +bird[i].fly());
		}
	}
}
