package home.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number 1:");
		int n1 = Integer.parseInt(br.readLine());

		System.out.println("Enter number 2:");
		int n2 = Integer.parseInt(br.readLine());

		System.out.println("Enter number 3:");
		int n3 = Integer.parseInt(br.readLine());
//		if (n1 > n2 && n1 > n3) {
//			System.out.println("Max number is:" + " " + n1);
//		} else if (n2 > n1 && n2 > n3) {
//			System.out.println("Max number is:" + " " + n2);
//		} else
//			System.out.println("Max number is:" + " " + n3);
//
//		if (n1 < n2 && n1 < n3) {
//			System.out.println("Min number is:" + " " + n1);
//		} else if (n2 < n1 && n2 < n3) {
//			System.out.println("Min number is:" + " " + n2);
//		} else
//		System.out.println("Min number is:" + " " + n3);

		double max = (n1 > n2 && n1 > n3)?n1: (n2>n3)?n2:n3;
		System.out.println("Max" + "-"+max);
		
		double min = (n1 < n2 && n1 < n3)?n1: (n2<n3)?n2:n3;
		System.out.println("Min" + "-"+min);
		//return Math.min(n1, Math.min(n2,n3)));
	
	}
}
