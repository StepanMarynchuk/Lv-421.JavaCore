
//Task1
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("Enter a number");
        double a = sc.nextDouble ();
        double b = sc.nextDouble ();
        try {
            System.out.println (div (a, b));
        } catch (Exception e) {
            System.out.println (e.getMessage ());        }


    }

    private static double div(double a, double b) throws Exception, NumberFormatException, ArithmeticException {
        if (a != 0 & b != 0) {
            return a / b;
        }else throw new Exception ("a or b = 0");
    }
}


/////////////////////////////////////////////
//Task2
        try {
            System.out.println (readNumber (1, 10));

        } catch (NumberFormatException e) {
            e.printStackTrace ();
        }
    }

         private static int readNumber (int start, int end) throws NumberFormatException {
             System.out.println ("Enter a number");
             Scanner sc = new Scanner (System.in);
             int number = sc.nextInt ();
             for (int n = start; n <= end; n ++) ;
                 if (number >= start && number <= end) {
                     return number;
                 }else throw new NumberFormatException ();
             
         }

}
