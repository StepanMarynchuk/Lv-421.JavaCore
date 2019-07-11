
public class Eagle extends FlyingBird{

	public Eagle() {
		super();
		setFeathers("Brown");
		setLayEggs("Small");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Eagle [feathers=" + getFeathers() + ", layEggs=" + getLayEggs() + "]";
	}
	
}
