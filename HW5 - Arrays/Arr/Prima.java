import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class  Prima {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	int[] arr = {3, -5, 7, -4, 8, 9, -2};
	int x = 0;
	int y = 0;
	int z = 0;
	int m = 0;
	int max = arr[0];
	int imax = 0;
	int i = 0;
	while (i < arr.length) {
		if (arr[i] > max) {
			max = arr[i];
			imax = i;
		}
		if (arr[i] > 0) {
			x=x+arr[i];
			z++;}
		else {
			y=y+arr[i];
			m++;		}
		i++;
	}
	
	
	System.out.println("Maximum = " + max);
	System.out.println("Sum of positive  = " + x);
	System.out.println("Amount of positive numbers  = " + z);
	System.out.println("Sum of negative = " + y);
	System.out.println("Amount of negative numbers  = " + m);

	}
}