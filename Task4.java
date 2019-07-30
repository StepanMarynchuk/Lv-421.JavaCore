import java.io.BufferedReader;
import java.io.IOException;
public class Task4 {
	
	public static void task4 (BufferedReader br) throws IOException {
		System.out.println("Enter the sentense:");
		String centense = br.readLine();
		centense.toLowerCase();
		char chars [] =  centense.toCharArray();
		int loudLetters = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i]=='a'|chars[i]=='o'|chars[i]=='e'|chars[i]=='i'|chars[i]=='u'|chars[i]=='y'){
				loudLetters++;
			}
		}
		System.out.println("This centense have loud letters - "+loudLetters);
	}



}
