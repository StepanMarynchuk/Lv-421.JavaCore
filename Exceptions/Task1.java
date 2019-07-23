

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void main(String[] args) {
        // Create a method for calculating the area of a rectangle
        //	int squareRectangle (int a, int b),
        //which should throw an exception if the user enters negative value.
        // Input values a and b from console.
        // Check the squareRectangle method in the method main. Check to input nonnumeric value.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int square;
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            square = a * b;
            if (a>0&&b>0)
                System.out.println(square);
            else
                System.out.println("entered 0");
        } catch (IOException e) {
            System.err.println("sourse not found");//нема з чого читати

        } catch (NumberFormatException e) {
            System.err.println("not a number");
        }

        System.out.println("hello");
    }
}


