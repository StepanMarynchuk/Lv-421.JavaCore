package WorkHome1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Zavdannya1 {

	public static void main(String[] args) throws IOException {
		double P=3.14;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������ �����");
		int radius = Integer.parseInt(br.readLine());
		

		System.out.println("�������� ������ = " + (2*P*radius));  
		System.out.println("����� ������ = " + P*(radius*radius ));

		

	}

}
