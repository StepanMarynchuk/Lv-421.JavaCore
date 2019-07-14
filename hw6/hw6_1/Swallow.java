package homeWork6;

public class Swallow extends FlyingBird{

	public Swallow(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public boolean fly() {
		return true;
	}

	@Override
	public String printName() {
		return "Swallow";
	}

}
