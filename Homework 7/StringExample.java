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

		System.out.println(
				"Longest word is-" + " " + longestWord + " " + "with number of its letters: " + longestWord.length());

		String s1 = word[1];
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));

			// Maybe, we can use other approach.

//			StringBuilder s2 = new StringBuilder(word[1]);
//			s2.reverse();
//			System.out.println(s2);
		}
		String s5 = "I  want  improve my skills";
		
	}
}
