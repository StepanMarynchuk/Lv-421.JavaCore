package homeWork6;

public class Eagle extends FlyingBird{

	public Eagle(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}	

	@Override
	public boolean fly() {
		return true;
	}

	@Override
	public String printName() {
		return "Eagle";
	}



}
