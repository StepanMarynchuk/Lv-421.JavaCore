package less1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork1a {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double r;
		double l;
		double s;
		double pi;
		pi = 3.14;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Введіть радіус = ");
 r = Integer.parseInt(br.readLine());
 l = 2*(pi*r);
 s = (pi*r)*(pi*r);
 
 System.out.println("Довжина кола = "+l);
 System.out.print("Площа кола = "+s);
	}

}
