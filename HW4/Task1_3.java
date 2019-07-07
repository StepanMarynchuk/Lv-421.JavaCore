package homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_3 {

	
		public enum HTTPError {
			Bad_Request, Unauthorized, Payment_Required, Forbidden
		}

		
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					
			System.out.println("Enter number of HTTP Error from 400 to 403");
			String error = br.readLine();
			
			switch (error) {
			case "400":
				System.out.println(HTTPError.Bad_Request);
				break;
			case "401":
				System.out.println(HTTPError.Unauthorized);
				break;
			case "402":
				System.out.println(HTTPError.Payment_Required);
				break;
			case "403":
				System.out.println(HTTPError.Forbidden);
				break;
			default:
				System.out.println("No this error ");
			}
	}

}
