import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Country {

	public enum Continent {

		Africa, Europe, America, Asia
	}

	public static void main(String[] args) throws IOException {

		Continent continent = Continent.Asia;
		boolean flag = false;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter country:");
		String country = br.readLine();

		switch (country) {
		case "Italy":
		case "France":
			continent = Continent.Europe;
			flag = true;
			break;
		case "Kongo":
		case "Egypt":
			continent = Continent.Africa;
			flag = true;

		default:
			System.out.println("No this country");
		}
		if (flag) {
			System.out.println(continent);
		}
	}
}
