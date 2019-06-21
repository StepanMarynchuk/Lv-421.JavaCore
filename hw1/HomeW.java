package MyPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeW {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter radius!");
		int rad = Integer.parseInt(bf.readLine());
		double S = 3.14*Math.pow(rad, 2);
		System.out.println("S = "+ S);
		double P = 2*3.14*rad;
		System.out.println("P = "+ P);
	
	}

}
