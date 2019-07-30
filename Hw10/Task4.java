package com.softserve;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Task4 {

    public static void main(String a[]) throws IOException {
        StringBuilder sb = new StringBuilder ();
        String strLine = "";
        List<String> list = new ArrayList<String> ();
        BufferedReader br = null;
        try {
            br = new BufferedReader (new FileReader ("C:\\Users\\User\\homework\\CV.txt"));
            while (strLine != null) {
                strLine = br.readLine ();
                sb.append (strLine);
                sb.append (System.lineSeparator ());
                strLine = br.readLine ();
                if (strLine == null)
                    break;
                list.add (strLine);
            }
            System.out.println (Arrays.toString (list.toArray ()));
            br.close ();
        } catch (FileNotFoundException e) {
            System.err.println ("File not found");
        } catch (IOException e) {
            System.err.println ("Unable to read the file.");
        }
        String longestLine = list.get (0);
        for (String num : list) {
            if (num.length () > longestLine.length ()) {
                longestLine = num;
            }
        }
        String filename = "newText.txt";
        BufferedWriter w = new BufferedWriter (new FileWriter (filename));
        w.write ("Number of lines: " + list.size ());
        w.newLine ();
        w.write ("The longest line is " + longestLine.length ());
        w.newLine ();
        w.close ();
        br.close ();
    }
}
