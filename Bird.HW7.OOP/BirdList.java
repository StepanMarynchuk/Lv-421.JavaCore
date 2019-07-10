public class BirdList {
    public static void main(String[] args) {
        Bird []bird = new Bird[4];
                bird[0] = new FlyingBird("short", "brown", FlyingBird.BirdKind1.Eagle);
                bird[1] = new nonFlyingBird("long", "spotty", nonFlyingBird.BirdKind.Kiwi);
                bird[2] = new nonFlyingBird("short", "white", nonFlyingBird.BirdKind.Pinguin);
                bird[3]= new FlyingBird("short", "white", FlyingBird.BirdKind1.Swallow);
            for(int i =0;i<bird.length;i++){
                System.out.println( i +1 + " " +  bird[i]);
                bird[i].fly();
            }

    }
}
