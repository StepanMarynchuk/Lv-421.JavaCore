import java.util.Random;

public class RandomValue {

    public static void task9() {

        int n = 100;
        int count = 0;
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            if (r.nextInt(2) == 1) {
                count++;
            }

        }
        System.out.println(count);
        System.out.println(n);
    }
}