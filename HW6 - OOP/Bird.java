public abstract class Bird{

        String feathers;
        String layEggs;
        public  Bird(String feathers,String layEggs){
            this.feathers = feathers;
            this.layEggs = layEggs;
        }
        public  abstract  void fly();
}