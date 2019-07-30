
import java.io.IOException;
import java.util.Scanner;


    public class Decompozition {
        public static void task2() throws IOException {
            int number;
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter a number: ");
            number = sc.nextInt();
            System.out.println("Given Number is: " + number);
            System.out.println("Prime Factors are: " );
            for(int i = 2; i< number; i++) {
                while(number%i == 0) {
                    System.out.println(i+" ");
                    number = number/i;
                }
            }
            if(number >2) {
                System.out.println(number);
            }
        }
    }