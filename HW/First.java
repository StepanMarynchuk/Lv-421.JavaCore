import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		System.out.println("Vvedit pershe chislo : ");
		Scanner scan = new Scanner(System.in);
		float a = scan.nextFloat();
		System.out.println("Vvedit druge chislo : ");
		Scanner scan1 = new Scanner(System.in);
		float b = scan.nextFloat();
		System.out.println("Vvedit tretye chislo : ");
		Scanner scan2 = new Scanner(System.in);
		float c = scan.nextFloat();
		
		if (a>=-5 && a<=5) {
			System.out.println("Pershe chislo vhodit v diapazon [-5,5]");
		}else {
			System.out.println("Pershe chislo NE vhodit v diapazon [-5,5]");
		}
		if (b>=-5 && b<=5) {
			System.out.println("Druge chislo vhodit v diapazon [-5,5]");
		}else {
			System.out.println("Druge chislo NE vhodit v diapazon [-5,5]");
		}
		if (c>=-5 && c<=5) {
			System.out.println("Tretye chislo vhodit v diapazon [-5,5]");
		}else {
			System.out.println("Tretye chislo NE vhodit v diapazon [-5,5]");
		}
		
		
	}

}
