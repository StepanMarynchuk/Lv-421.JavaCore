import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task6 {

    public static  void countWords(BufferedReader br) throws IOException {

        String s = br.readLine();
        String[] str = s.split(" ");

        System.out.print (str.length);
    }



}

