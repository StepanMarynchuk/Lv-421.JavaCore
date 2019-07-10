public class nonFlyingBird extends Bird {
    public enum BirdKind{Pinguin, Kiwi}
    BirdKind birdKind = BirdKind.Kiwi;
    public nonFlyingBird(String feathures, String layEggs, BirdKind birdKind){
        super(feathures, layEggs);
        this.birdKind = birdKind;

    }

    @Override
    public void fly() {
        System.out.println("nonFlying");
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "feathers= " + feathers + '\'' +"layEggs= " + layEggs + '\'' + "nonFlyingBird{" +
                "birdKind= " + birdKind +
                '}';
    }
}
