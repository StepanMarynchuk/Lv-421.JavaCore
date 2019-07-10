

public class FlyingBird extends Bird {
    public enum BirdKind1{Eagle, Swallow}
    BirdKind1 birdKind1 = BirdKind1.Eagle;
    public FlyingBird(String feathures, String layEggs, BirdKind1 birdKind1){
        super(feathures, layEggs);
        this.birdKind1=birdKind1;
    }
//    public FlyingBird(String kindOfBird){
//        this.kindOfBird=kindOfBird; } додати конструктор ше один вже не можна?

    @Override
    public void fly() {
        System.out.println("flying");
    }



    @Override
    public String toString() {
        return "FlyingBird{" +
                "feathers= " + feathers + '\'' +"layEggs= " + layEggs + '\'' + "FlyingBird{" +
                "birdKind1= " + birdKind1 + '}';
    }
}
