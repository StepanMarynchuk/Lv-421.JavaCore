package Lesson4;

public class MainProduct {

	public static void main(String[] args) {
		Product p1 = new Product("Ball", 210.10, 55);
		Product p2 = new Product("Doll", 315.25, 100);
		Product p3 = new Product("Car", 265.00, 156);
		Product p4 = new Product("Bike", 799.99, 75);
		
		System.out.println("Max price = " + Math.max(p1.getPrice(), Math.max(p2.getPrice(), Math.max(p3.getPrice(), p4.getPrice()))));
		System.out.println("Biggest quantity = " + Math.max(p1.getQuantity(), Math.max(p2.getQuantity(), Math.max(p3.getQuantity(), p4.getQuantity()))));
		
		
		

	}

}
