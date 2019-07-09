import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarData {
    public static void main(String[] args) throws IOException {
        Car[] car = {
                new Car(Car.CarType.Porsche, 3),
                new Car(Car.CarType.Mazda, 2),
                new Car(Car.CarType.Opel, 4),
                new Car(Car.CarType.Kopiejka, 4)};
        BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter year of production");

        for (int k = 0; k < car.length; k++) {
            car[k].setYearOfProduction(Integer.parseInt(br5.readLine()));}//звідки я можу знати до якоі мащини мені допищеться дата,,
            System.out.println();
//        car[1].setYearOfProduction(Integer.parseInt(br5.readLine()));
//        car[2].setYearOfProduction(Integer.parseInt(br5.readLine()));
//        car[3].setYearOfProduction(Integer.parseInt(br5.readLine()));
            {

            }
            Car temp;
            for (int i = 0; i < car.length - 1; i++) {
                for (int j = i + 1; j < car.length; j++) {
                    if (car[i].getYearOfProduction() < car[j].getYearOfProduction()) {
                        temp = car[i];
                        car[i] = car[j];
                        car[j] = temp;
                    }
                }
            }
            for (int i = 0; i < car.length; i++) {
                System.out.println(car[i]);
            }

        }
    }
