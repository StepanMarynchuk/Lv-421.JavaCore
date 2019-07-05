package homeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tasks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("-------------PART 1-------------");
		
		String [] months = {"January","February","March","April","May","June","July", 
							"August","September","October","November","December"};
		int numMonth = 1;
		System.out.println("Enter the number of month or Quit - 0");
		while (numMonth != 0) {
			numMonth = Integer.parseInt(br.readLine());
			if (numMonth <= 0 || numMonth > 12) {
				System.out.println("There is no such number for the month");
				continue;
			}
			System.out.println(numMonth + " month it is "+ months[numMonth -1]);
		} 
		
		System.out.println("-------------PART 2-------------");
		
		int [] arrNum10 = {10,-5,4,-11,1,-5,5,3,-4,10};
		int arrFirst5 = 0;
		int arrLast5 = 1;
		for (int i=0; i<5; i++) {arrFirst5 += arrNum10[i];}
		System.out.println("Sum first 5 numbers = " + arrFirst5);
		if (arrFirst5 < 0) {
			for (int i=5; i<10; i++) {arrLast5 = arrLast5 * arrNum10[i];}
			System.out.println("Product last 5 numbers = " + arrLast5);
		}
		
		System.out.println("-------------PART 3.1-------------");
		
		int [] arrNum5 = {10,-5,4,-11,1}; 
		int secondPositive = 0;
		for (int i=0; arrNum5.length>i; i++) {
			if (arrNum5[i]>0) {
				secondPositive++;
				if (secondPositive>=2) {
					System.out.println("Position of second positive number is: " + (i+1));
					break;
				}
			}
		}
		int min = 0;
		int positionMin = 0;
		for (int i=0; arrNum5.length>i; i++) {
			if (arrNum5[i]<min) {
				min = arrNum5[i];
				positionMin = (i+1);
			}
		}
		System.out.println("Position of minimum number is: " + (positionMin));
		
		System.out.println("-------------PART 3.2-------------");
		
		System.out.println("Enter some ineger numbers:");
		ArrayList <Integer> intNum = new ArrayList <Integer> ();
		int newIntNum;
		do {
			newIntNum = Integer.parseInt(br.readLine());
			if (newIntNum > 0) {
				intNum.add(newIntNum);
				}
		} while(newIntNum >= 0);
		int productEven = 1;
		for (int i = 0; intNum.size() > i; i++) {
			System.out.print(intNum.get(i)+ ", ");
			if ((intNum.get(i) % 2)==0 ) {
				productEven = productEven * intNum.get(i);
			}
		}
		System.out.println();
		System.out.println("Product of all entered even numbers = " + productEven);
	}

}
