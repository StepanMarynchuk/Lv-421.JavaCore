import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        int[] month = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of the month");

        for (int i = 0; i < month.length; i++) {
            i = Integer.parseInt(br1.readLine());
            switch (i) {
                case 1:
                    System.out.println("this month has 31");
                    break;
                case 2:
                    System.out.println("this month has 28");
                    break;
                case 3:
                    System.out.println("this month has 31");
                    break;
                case 4:
                    System.out.println("this month has 30");
                    break;
                case 5:
                    System.out.println("this month has 31");
                    break;
                case 6:
                    System.out.println("this month has 30");
                    break;
                case 7:
                    System.out.println("this month has 31");
                    break;
                case 8:
                    System.out.println("this month has 31");
                    break;
                case 9:
                    System.out.println("this month has 30");
                    break;
                case 10:
                    System.out.println("this month has 31");
                    break;
                case 11:
                    System.out.println("this month has 30");
                    break;
                case 12:
                    System.out.println("this month has 31");
                    break;
// як в консолі вводиться 12 система закіньчується

            }
        }
    }

}