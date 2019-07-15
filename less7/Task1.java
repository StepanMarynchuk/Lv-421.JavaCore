package less7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("-------------Task 1--------------");
		
		String s1 = "IT";
		String s2 = "IT Academy";
		System.out.println(s1.equals(s2.substring(0, s1.length())));
		
		System.out.println("-------------Task 2--------------");
		
		String nameSurname = "Mykytyuk Yuriy Stepanovych";
		Pattern p = Pattern.compile("(([A-Z]*)([a-z]*)) *(([A-Z])([a-z]*)) *(([A-Z])([a-z]*))");
		Matcher m = p.matcher(nameSurname);
		if (m.find())
			System.out.println(m.group(1)+" "+m.group(5)+" "+m.group(8)); //surnames and initials
			System.out.println(m.group(4));//name
			System.out.println(m.group(4)+" "+m.group(7)+" "+m.group(1));//name, middle name & last name
			
			System.out.println("-------------Task 3--------------");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for (int i = 0; i < 5; i++) {
				System.out.println("Enter the login: ");	
				String login = br.readLine();
				System.out.println("validation is = " + checkLogin(login));	
			}
	}
	
	public static boolean checkLogin(String login) {
		Pattern p = Pattern.compile("\\w{3,15}");
		Matcher m = p.matcher(login);
		return m.matches();
	}

}
