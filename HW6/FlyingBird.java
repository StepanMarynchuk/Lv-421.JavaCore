public class FlyingBird extends Bird {
    public enum BirdKind1{Eagle, Swallow}
    BirdKind1 birdKind1 = BirdKind1.Eagle;
    public FlyingBird(String feathures, String layEggs, BirdKind1 birdKind1){
        super(feathures, layEggs);
        this.birdKind1=birdKind1;
    }

    @Override
    public void fly() {
        System.out.println("flying.");
    }



    @Override
    public String toString() {
  
    	return  birdKind1 + " has " + feathers + " feathers." + " Color of its eggs is " + layEggs +". " + birdKind1+ " is " ;
    } 
}