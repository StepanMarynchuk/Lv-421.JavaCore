import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeMade {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] words = new String [5];
		for (int i = 0; i < words.length; i++) {
			System.out.println("Enter word " + (i+1) + ":");
			words[i] = br.readLine();
		}
		int indexLW =0;
		for (int i = 0; i < words.length; i++) {
			if (words[indexLW].length()<words[i].length()) indexLW = i;
		} 
		System.out.println("the longest word is - "+words[indexLW]);
		System.out.println("the longest word has number letters - "+words[indexLW].length());
		StringBuilder sb = new StringBuilder(words[1]);
		System.out.println("Second word reverse - " + sb.reverse());

	}
}