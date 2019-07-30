package finalproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import finalproject.Wine.Type;

public class WineType {

	public static void main(String[] args) throws IOException {
		
		
		List <Wine> wines = new ArrayList<> ();
		
		wines.add(new Merlot (2016,"France","K",100.0, 500.0, Type.Dry));
		wines.add(new Chardonnay (2017,"Italy","S",105.0, 500.0, Type.SemiDry));
		wines.add(new SauvignonBlanc (2017,"Chily","C",110.0, 500.0, Type.SemiSweet));
		wines.add(new CabernetSauvignon (2018,"Germany","G",120.0, 500.0, Type.Sweet));
		
		for (Wine w : wines) {
			System.out.println("List of wine: "+ w);
						
		}
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 System.out.println("Enter type of wine (Dry/Sweet/SemiDry/SemiSweet): ");
			 
			 String type = br.readLine();
			 if (type.equals(wines)) {
								
				 System.out.println(wines);}

	}
}
	

