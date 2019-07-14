public class nonFlyingBird extends Bird {
    public enum BirdKind2{Pinguin, Kiwi}
    BirdKind2 birdKind2 = BirdKind2.Kiwi;
    public nonFlyingBird(String feathures, String layEggs, BirdKind2 birdKind2){
        super(feathures, layEggs);
        this.birdKind2 = birdKind2;

    }

    @Override
    public void fly() {
        System.out.println("not flying.");
    }

    @Override
    public String toString() {
    	return  birdKind2 + " has " + feathers + " feathers." + " Color of its eggs is " + layEggs +". " + birdKind2+ " is " ;
    }
}