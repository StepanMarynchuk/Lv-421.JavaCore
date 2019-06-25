package less1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork1a {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int r;
		double p;
		double s;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the radius = ");
		r = Integer.parseInt(br.readLine());
		p = 2 * (Math.PI * r);
		s = (Math.PI * r) * (Math.PI * r);

		System.out.println("Perimeter = " + p);
		System.out.println("Area = " + s);
	}

}
