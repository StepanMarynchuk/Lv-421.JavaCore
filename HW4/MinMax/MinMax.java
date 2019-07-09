import java.util.*;

public class MinMax{

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n;
        int t;
        int s;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        

            System.out.println ("Enter the number");
            n = sc.nextInt ();
            if (n < min) {
                min = n;
            }else {
                max = n;
            }
            t = sc.nextInt ();
            if (t < min) {
                min = t;
            }else {
                max = t;
            }
            s = sc.nextInt ();
            if (s < min) {
                min = s;
            }else {
                max = s;
            }

            System.out.println ("Maximum number =" + max);
            System.out.println ("Minimum number =" + min);

    }
}