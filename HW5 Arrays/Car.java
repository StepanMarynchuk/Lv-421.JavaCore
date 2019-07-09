public class Car {
    //    Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
//    certain model year  (enter year in the console);
//    ordered by the field year.
    enum CarType {
        Porsche, Mazda, Opel, Renaul, Kopiejka
    }

    private CarType carType;
    private int yearOfProduction;
    private int enigineCapacity;

    public Car() {};
    public Car(CarType carType, int yearOfProduction, int enigineCapacity){
        this.carType=carType;
        this.yearOfProduction=yearOfProduction;
        this.enigineCapacity=enigineCapacity;
    }
    public Car(CarType carType,int enigineCapacity){
        this.carType=carType;
        this.enigineCapacity=enigineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getEnigineCapacity() {
        return enigineCapacity;
    }

    public void setEnigineCapacity(int enigineCapacity) {
        this.enigineCapacity = enigineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", yearOfProduction=" + yearOfProduction +
                ", enigineCapacity=" + enigineCapacity +
                '}';
    }

}