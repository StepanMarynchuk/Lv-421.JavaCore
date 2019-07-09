import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    //Enter 10 integer numbers.
    // Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
    public static void main(String[] args) throws IOException {
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers");

        int[] tab = new int[10];
        int sum = 0;

        for (int i=0; i<tab.length; i++) {
           int k = Integer.parseInt(br2.readLine());
           if(k<0)sum+=k; {break;}
          // System.out.println("We have negative numbers" );
          // else if
          // for (i=0;i<tab.length;i++){
           //    sum +=tab[i];

           }
            System.out.println("sum = " + sum);


         //   { System.out.println("All numbers are positive, sum of firt 5 is " + sum);}

           // if (i < 0) {

            }

        }

       // System.out.println("sum = " + sum);







