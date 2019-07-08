package hometask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import hometask.Car.Type;

public class CarApp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Car[] c = new Car[4];

		c[0] = new Car(Type.Hatchback, 2016, 2.2);
		c[1] = new Car(Type.Coupe, 2015, 2.0);
		c[2] = new Car(Type.Crossover, 2017, 3.0);
		c[3] = new Car(Type.Sedan, 2018, 1.6);

		for (Car a : c) {
			System.out.println(a);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter model year (2015/2016/2017/2018):");
		int year = Integer.parseInt(br.readLine());
//		System.out.println();

		for (Car a : c) {
			if (a.getYear() == year)

				System.out.println(a.getType());
		}

		Car sort;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i].getYear() < c[j].getYear())
					;
				{
					sort = c[i];
					c[i] = c[j];
					c[j] = sort;

				}
			}
		}
		for (Car a1 : c) {
			System.out.println(a1);
		}
	}
}
