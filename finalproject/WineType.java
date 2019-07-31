package finalproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import finalproject.Wine.Type;

public class WineType {

	public static void main(String[] args) {

		List<Wine> wines = new ArrayList<>();

		try {
			wines.add(new Merlot(2018, "France", "F", 100.0, 500.0, "dRy"));

			wines.add(new Chardonnay(2015, "Italy", "I", 105.0, 500.0, "sweet"));

			wines.add(new SauvignonBlanc(2017, "Chile", "C", 110.0, 500.0, "semidry"));

			wines.add(new CabernetSauvignon(2016, "Germany", "G", 120.0, 500.0, "semisweet"));
		} catch (TypeException e) {
			System.err.println(e.getMessage());

		}

		for (Wine w : wines) {
			System.out.println("List of wine: " + w);

		}
		System.out.println("List of wine ordered by year :");

		wines.sort(new YearComparator());

		for (Wine wi : wines) {
			System.out.println(
					"Wine name: " + wi.getName() + " from year: " + wi.getYear() + " price: " + wi.getPrice() + " UAH");

		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year = 0;

		try {
			System.out.println("Enter year of wine (2015-2018): ");

			year = Integer.parseInt(br.readLine());

		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		try {

			System.out.println(printYear(year));
			for (Wine win : wines) {
				if (win.getYear() == year) {

					System.out.println("Wine name: " + win.getName() + " country: " + win.getCountry() + " type: "
							+ win.getType() + " price: " + win.getPrice() + " UAH");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static int printYear(int a) throws Exception {

		if (a > 2018 || a < 2015)

			throw new Exception("Wine from this year is not in our list");
		return a;
	}

}