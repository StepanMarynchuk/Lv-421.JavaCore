package hometask;

public class ArrayNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Numbers = { 1, 2, -3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;
		int product = 1;
		for (int i = 0; i < Numbers.length-5; i++) {sum += Numbers[i];}
		System.out.println("If first 5 elements are positive, their sum = " + sum);
		
//{break;}
		
		if (Numbers[0] < 0 || Numbers[1] < 0 || Numbers[2] < 0||Numbers[3]<0||Numbers[4]<0||Numbers[5]<0) {
			for (int i = 5; i < Numbers.length; i++) {product = product * Numbers[i];}

			System.out.println("If only 1 of first 5 elements are nagative, product last 5 elements = " + product);}
	
		}
	}
