import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class tabs {
    public static void main(String[] args) {
        //Enter a sentence that contains the words between more than one space.
        // Convert all spaces, consecutive, one.
        // For example, if we introduce the sentence "I    am      learning     Java   Core»,
        // we have to get the "I'm learning Java Core»
        String pattern1 = "[A-Za-z]+";
        String text = "My   name    is  Nataliia";
        Pattern p = Pattern.compile(pattern1);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + " ");
        }
    }
}
