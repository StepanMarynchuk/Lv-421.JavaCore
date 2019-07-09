package Cont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Car[] cars = new Car[4];
		for (int i = 0; i < 4; i++) {
			cars[i] = new Car("model" + i, 2000 + i, 390 + i * 10);
		}
		Car.showmodelyear(cars, br);
		Car.orderbyyear(cars);
		

	}
}