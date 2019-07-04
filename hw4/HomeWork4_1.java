package homeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		System.out.println("----------------Part 1------------------");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 3 float numbers \nfirst number:");
		float fnumber1 = Float.parseFloat(br.readLine());
		System.out.println("second number:");
		float fnumber2 = Float.parseFloat(br.readLine());
		System.out.println("third number:");
		float fnumber3 = Float.parseFloat(br.readLine());
		System.out.println("Enter the range numeric:");
		int range = Integer.parseInt(br.readLine());
		if (checkBelong(fnumber1, range)&&checkBelong(fnumber2, range)&&checkBelong(fnumber3, range)) {
			System.out.println("These numbers all belong to the range [" + range + "]");
		} else {
			System.out.println("These numbers NOT all belong to the range [" + range + "]");	
		}
		
		
		System.out.println("----------------Part 2------------------");
		
		System.out.println("Enter 3 Integer numbers \nfirst number:");
		int inumber1 = Integer.parseInt(br.readLine());
		System.out.println("second number:");
		int inumber2 = Integer.parseInt(br.readLine());
		System.out.println("third number:");
		int inumber3 = Integer.parseInt(br.readLine());
		System.out.println("Max number = " + Math.max(inumber1, Math.max(inumber2, inumber3)));
		System.out.println("Min number = " + Math.min(inumber1, Math.min(inumber2, inumber3)));
		
		
		System.out.println("----------------Part 3------------------");
		
		System.out.println("Enter number of HTTP Error (400-406)");
		String errorNumber = br.readLine();
				//"there are no errors in the system";
		switch (errorNumber) {
		case "400":		
			System.out.println(errorNumber + " it is " + HTTPError.Bad_Request);
			break;
		case "401":
			System.out.println(errorNumber + " it is " + HTTPError.Unauthorized);
			break;
		case "402":
			System.out.println(errorNumber + " it is " + HTTPError.Payment_Required);
			break;
		case "403":
			System.out.println(errorNumber + " it is " + HTTPError.Forbidden);
			break;
		case "404":
			System.out.println(errorNumber + " it is " + HTTPError.Not_Found);
			break;
		case "405":
			System.out.println(errorNumber + " it is " + HTTPError.Method_Not_Allowed);
			break;
		case "406":
			System.out.println(errorNumber + " it is " + HTTPError.Not_Acceptable);
			break;
		default :
			System.out.println("there are no errors in the system");
		}
	}
	
	public static boolean checkBelong (float number, int range) {
		return Math.abs(number) > range ? false : true;

	}

	public enum HTTPError {
		Bad_Request, Unauthorized, Payment_Required, Forbidden, Not_Found , Method_Not_Allowed , Not_Acceptable
	}
}
