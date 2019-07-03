import java.util.Scanner;

public class Druge {

	public static void main(String[] args) {
		System.out.println("Vvedit pershe chislo : ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Vvedit druge chislo : ");
		Scanner scan1 = new Scanner(System.in);
		int b = scan.nextInt();
		System.out.println("Vvedit tretye chislo : ");
		Scanner scan2 = new Scanner(System.in);
		int c = scan.nextInt();
		if (a>b&&a>c) {
			System.out.println("Pershe chislo : "+"("+a+")- ye naybil'shim chislom");
		} else if (b>a&&b>c){
			System.out.println("Druge chislo : "+"("+b+") - ye naybil'shim chislom");
		}else {
			System.out.println("Tretye chislo : "+"("+c+") - ye naybil'shim chislom");
		}

	}

}
