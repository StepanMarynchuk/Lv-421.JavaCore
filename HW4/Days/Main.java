package mir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
            System.out.println ("Day in the week in order");
            int input = Integer.parseInt (br.readLine ());
        switch (input) {
            case 1:
                System.out.println (Days.Monday.getEN ());
                System.out.println (Days.Monday.getUA ());
                break;
            case 2:
                System.out.println (Days.Tuesday.getEN ());
                System.out.println (Days.Tuesday.getUA ());
                break;
            case 3:
                System.out.println (Days.Wednesday.getEN ());
                System.out.println (Days.Wednesday.getUA ());
                break;
            case 4:
                System.out.println (Days.Thursday.getEN ());
                System.out.println (Days.Thursday.getUA ());
                break;
            case 5:
                System.out.println (Days.Friday.getEN ());
                System.out.println (Days.Friday.getUA ());
                break;
            case 6:
                System.out.println (Days.Saturday.getEN ());
                System.out.println (Days.Saturday.getUA ());
                break;
            case 7:
                System.out.println (Days.Sunday.getEN ());
                System.out.println (Days.Sunday.getUA ());
                break;

            default:
                System.out.println("Check input");
                System.exit(0);



        }
    }
}