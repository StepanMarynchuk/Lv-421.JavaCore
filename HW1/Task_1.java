package academy.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		System.out.println("What is a radius of the  flower bed");
		double radius = Integer.parseInt(br.readLine());
		System.out.println((2*radius*3.14)+ " is perimeter");

	}

}
