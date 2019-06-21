package MyPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeW3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter USA value per minute");
		 int usa = Integer.parseInt(bf.readLine());
		System.out.println("Enter Japan value per minute");
		 int jap = Integer.parseInt(bf.readLine());
		System.out.println("Enter UK value per minute");
		 int uk = Integer.parseInt(bf.readLine());
		 
		 
		 System.out.println("How much you talk(USA)");
		  int usa2 = Integer.parseInt(bf.readLine());
		 System.out.println("How much you talk(Japan)"); 
		  int jap2 = Integer.parseInt(bf.readLine());
		 System.out.println("How much you talk(UK)");
		  int uk2 = Integer.parseInt(bf.readLine());
		  
		  
		  System.out.println("(USA)Your call value is "+ usa*usa2 + " dolars");
		  System.out.println("(Japan)Your call value is "+ jap*jap2 + " yen" );
		  System.out.println("(UK)Your call value is " + uk*uk2 + " pounds");
		  System.out.println("*******************");
		  
		  double all = (usa*usa2) + (jap*jap2) + (uk*uk2);
		  System.out.println("Value of all calls is " + all);
	
	}

}
