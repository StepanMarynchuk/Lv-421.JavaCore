package newpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		String pattern = "[a-zA-Z0-9]{3,15}";
		String text = "Stepan";

		Pattern p = Pattern.compile(pattern);

		Matcher m = p.matcher(text);

		if (m.matches()) {
			System.out.print("ok gggg");

		} else {
			System.out.println("not");
		}
	}
}
