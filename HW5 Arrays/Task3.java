import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    // Enter 5 integer numbers. Find
    // position of second positive number;
    //  minimum and its position in the array.
    public static void main(String[] args) {
        //  BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        int[] line = new int[]{12, 3, 554, 123, 345, 5454, 33, -33, 99};
        int min = 0;
        int position = 0;
        int posision1 = 0;
        for (int i = 0; i < line.length; i++)
        //  number = Integer.parseInt(br3.readLine());
        {
            if (line[i] > 0)
                posision1++;
            if (posision1 == 2)
                System.out.println(posision1 +" "+i);
        }
        {

         for (int i = 0; i < line.length; i++){
            if (line[i]<min)
                min=line[i];
            position = i-1;//чому потрібно дописувати -1 і чи правильно це взагалі???

        }
        System.out.println(min +" "+ position);

        }
        System.out.println();
    }
    }
