package home.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Errors{	

	static HTTPError httperror;
	
	public enum HTTPError {
		
		BadRequest, Unauthorized, ServerError
	}

	public static void main(String[] args) throws NumberFormatException, IOException{
		

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter error:");
		int error = Integer.parseInt(br.readLine());
		
		switch (error) {
		
		case 400:
			
			httperror = HTTPError.BadRequest;
			System.out.println("Name of this error - BadRequest");
			
			break;
			
		case 401:
			httperror = HTTPError.Unauthorized;
			System.out.println("Name of this error - Unauthorized");
			break;
			
			
		case 402:
			httperror = HTTPError.ServerError;
			System.out.println("Name of this error - ServerError");
			break;
			
		default:
			
			System.out.println("No information about this error");
		
	}}}

