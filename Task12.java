import java.io.BufferedReader;
import java.io.IOException;

public class Task12 {
    public static void task12(BufferedReader br) throws IOException {
        int sum = 0;
        for (int i = 0; i < 1000; i++)
            if ((i % 3 == 0) || (i % 5 == 0))
                sum+=i;
                System.out.println("Sum " + sum);
    }
}
