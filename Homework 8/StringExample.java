package homework8;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I want improve my skills";
		String[] word = s.split(" ");

		String longestWord = word[0];

		for (int i = 0; i < word.length; i++) {
			if (word[i].length() > longestWord.length()) {

				longestWord = word[i];
			}
		}

		System.out.println("Longest word is-" + " "+ longestWord +" "+ "with number of its letters: "+ longestWord.length());

	}
}
