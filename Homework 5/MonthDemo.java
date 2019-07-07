package home.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;

public class MonthDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int MONTHS[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int a : MONTHS) {
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of month (1,2,3,4,5,6,7,8,9,10,11,12):");
		int nm = Integer.parseInt(br.readLine());

		Month month = Month.of(nm);
		System.out.println(month);

		if (nm >= 1 && nm <= 12) {
			System.out.println("Amount days of " + month + " - " + MONTHS[nm - 1]);
		}

	}
}
// second approach:

//if (nm == 1 || nm == 3 || nm == 5 || nm == 7 || nm == 8 || nm == 10 || nm == 12) {
//System.out.println("Amount days of " + " " + month + " - " + MONTHS[0]);
//} else if (nm == 4 || nm == 6 || nm == 9 || nm == 11) {
//System.out.println("Amount days of " + " " + month + " - " + MONTHS[4]);
//} else {
//System.out.println("Amount days of " + " " + month + " - " + MONTHS[1]);
