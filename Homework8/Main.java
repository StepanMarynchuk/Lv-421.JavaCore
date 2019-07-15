import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = null;
		task1(br,sb);
		task2(br);
		task3(br);
	}

	private static void task1(BufferedReader br, StringBuilder sb) throws IOException {
		System.out.println("Enter a 5 word sentence");
		String sentance = br.readLine();
		String arr[] = sentance.split(" ");
		String max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > max.length()) {
				max = arr[i];
			}
		}
		System.out.println("The longest word " + max);
		System.out.println("Letters in longest word " + max.length());
		sb = new StringBuilder(arr[1]);
		sb.reverse();
		System.out.println("Reverse 2nd word " + sb);

	}

	private static void task2(BufferedReader br) throws IOException {
		System.out.println("Enter a sentence");
		String sentance = br.readLine();
		sentance = sentance.replaceAll(" +", " ");
		System.out.println(sentance);
	}

	private static void task3(BufferedReader br) throws IOException {
		System.out.println("Enter a sentence with money");
		String sentance = br.readLine();
		String pattern = "\\$\\d+\\.\\d{2}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(sentance);
		while (m.find()) {
			System.out.print(sentance.substring(m.start(), m.end()) + "*");
		}
	}
}
