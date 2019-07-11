
public class Penguin extends NonFlyingBird{

	public Penguin() {
		super();
		setFeathers("Black and White");
		setLayEggs("Big");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Penguin [feathers=" + getFeathers() + ", layEggs=" + getLayEggs() + "]";
	}
	
}
