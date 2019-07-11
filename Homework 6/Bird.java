package hometask;

public abstract class Bird {
private String feathers;
private String layEggs;
public String getFeathers() {
	return feathers;
}

public void setFeathers(String feathers) {
	this.feathers = feathers;
}

public String getLayEggs() {
	return layEggs;
}

public void setLayEggs(String layEggs) {
	this.layEggs = layEggs;
}



public abstract void getFly ();

}
