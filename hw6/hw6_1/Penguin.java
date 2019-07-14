package homeWork6;

public class Penguin extends NonFlyingBird{

	public Penguin(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public boolean fly() {
		return false;
	}

	@Override
	public String printName() {
		return "Penguin";
	}

}
