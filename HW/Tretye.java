import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tretye {

	static HTTPError httperror;
		public enum HTTPError {
			HTTPError401, HTTPError402,HTTPError403,HTTPError404
		}

		

		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number of your Error : ");
			int error = Integer.parseInt(br.readLine());
		 switch (error) { 
		 case 401:  
			 System.out.println("Error name : "+ HTTPError.HTTPError401);
			 httperror = HTTPError.HTTPError401;
		 break;
		 case 402:  
			 System.out.println("Error name : "+ HTTPError.HTTPError402);
			 httperror = HTTPError.HTTPError401;
		 break;
		 case 403:  
			 System.out.println("Error name : "+ HTTPError.HTTPError403);
			 httperror = HTTPError.HTTPError401;
		 break;
		 case 404:  
			 System.out.println("Error name : "+ HTTPError.HTTPError404);
			 httperror = HTTPError.HTTPError401;
		 break;
		 default:
				System.out.println("No found.");
		 
		 
		 }
		

	

	}
}