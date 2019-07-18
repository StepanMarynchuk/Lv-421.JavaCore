import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeMade{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++){
			System.out.println("Enter the text  that contains several occurrences of US currency: ");	
			String currency = br.readLine();
			System.out.println("validation is = " + findCurrency(currency));
		}
	}
	public static String findCurrency(String text) {
		Pattern p = Pattern.compile("\\$[0-9]+\\.[0-9]{2}");
		Matcher m = p.matcher(text);
		String currency = "currency: ";
		while (m.find()) {
			currency = currency.concat((text.substring(m.start(), m.end()))+" ");
		}
		return currency;
	}

}