public class HomeMade {

	public static void main(String[] args) {
		String centence = " I    am      learning     Java   Core";
		centence = centence.strip();
		StringBuilder sb = new StringBuilder(centence);

			int index=0;
			while ((sb.indexOf(" ",index) != -1)&&((sb.indexOf(" ",index+1) != -1))) {
				if (sb.indexOf(" ",index) == (sb.indexOf(" ",index+1)- 1)) sb.deleteCharAt(index);
					else index++;
			}
		System.out.println(sb);
	}
}