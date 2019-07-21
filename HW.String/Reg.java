import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    public static void main(String[] args)throws IOException {
        //Implement a pattern for US currency: the first symbol "$",
        // then any number of digits, dot and two digits after the dot.
        // Enter the text from the console that contains several occurrences of US currency.
        // Display all occurrences on the screen.
       String pattern = "\\$[0-9]+\\.[0-9]{2}";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String text = br.readLine();
       Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        System.out.println(m.matches());
        m.reset();
        while (m.find()){
            System.out.println(text.substring(m.start(),m.end()));
        }

        System.out.println();

    }
}
