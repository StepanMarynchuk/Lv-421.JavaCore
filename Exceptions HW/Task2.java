import org.omg.CORBA.INTERNAL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    //Write a method readNumber(int start, int end),
    // that read from console integer number and return it,
    // if it is in the range [start...end].
    //If an invalid number or non-number text is read,
    // the method should throw an exception.
    //Using this method write a method main(), that has to enter 10 numbers:
    //	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
    static void  readNumber(int start, int end) throws IOException, Range , NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number");

        int i = Integer.parseInt(br.readLine());
//        if (i == Integer.parseInt(null)) //чи можна  кидати Exceptions окремо до кожного круку, і ми ця лінійка має сенс?)
//        {
//            throw new NumberFormatException("not a number");}
            if (start > i && i > end){
                throw new Range("not in the range");
        }
                System.out.println(i);

            }






    public static void main(String[] args)throws IOException {
        try {
            readNumber(2, 9);
//        }catch (NumberFormatException e){
//            System.out.println("Not a number");
        } catch (Range range) {
            System.out.println(range.getMessage());
        }
    }


}
