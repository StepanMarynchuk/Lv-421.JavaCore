package homeWork6;

public class Kiwi extends NonFlyingBird{

	public Kiwi(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public boolean fly() {
		return false;
	}

	@Override
	public String printName() {
		return "Kiwi";
	}


}
	


