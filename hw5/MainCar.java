package homeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCar {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Car [] carArr = {new Car("Sedan", 2019, 2.2f),
				 		 new Car("Wan", 2018, 3.5f),
				 		 new Car("Sedan", 2017, 1.5f),
				 		 new Car("Pickup", 2019, 4.8f),
				 		 new Car("Wan", 2018, 2.2f)};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the year of production a car (2017-2019) :");
		int carYer = Integer.parseInt(br.readLine()); 
		for (int i = 0; i < carArr.length; i++) {
			if (carArr[i].getProdYear()==(carYer)) {System.out.println(carArr[i]);}
		}
		System.out.println("----------------Ordered cars---------------");
		Car carForOrder;
		for (int i = 0; i < carArr.length; i++) {
			for (int j = 0; j < carArr.length; j++) {
				if (carArr[i].getProdYear() > carArr[j].getProdYear()) {
					carForOrder = carArr[i];
					carArr[i] = carArr[j];
					carArr[j] = carForOrder;
				}
			}
		}
		for (Car i: carArr) {
			System.out.println(i);
		}

	}

}
