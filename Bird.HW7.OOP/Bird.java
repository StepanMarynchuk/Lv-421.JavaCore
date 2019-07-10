
    public abstract class Bird{
    //Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().  
        //Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.
        //Create array Bird and add different birds to it.
        //Call fly() method for all of it. Output the
        //information about each type of created bird.
        String feathers;
        String layEggs;
        public  Bird(String feathers,String layEggs){
            this.feathers = feathers;
            this.layEggs = layEggs;
        }
        public  abstract  void fly();
}
