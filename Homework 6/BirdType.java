package hometask;

public class BirdType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird[] b = new Bird[4];
		b[0] = new Eagle("grey", "yes");
		b[1] = new Swallow("black", "yes");
		b[2] = new Penguin("yellow", "yes");
		b[3] = new Chicken ("white", "yes");

		for (int i = 0; i < b.length; i++) {
			if (b[i] instanceof FlyingBird) {
			System.out.println((FlyingBird)b[i]);
			b[i].getFly();}
			
			if (b[i] instanceof NonFlyingBird) {
				System.out.println((NonFlyingBird)b[i]);
				b[i].getFly();
			}
		}
	}
}
