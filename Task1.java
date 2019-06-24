package home.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("radius is:");
		double r = Double.parseDouble(br.readLine());
		double q= 3.141592;
		double p= 2*q*r;
		System.out.println("perimeter is:"+ p);
		double a= q*r*r;
		System.out.println("area is:"+ a);
	
	}

}
