
public class Task1{
    public static void main(String[] args) {
        // Create method div(),
        // which calculates the dividing of two double numbers.
        // In main method input 2 double numbers and call this method. Catch all exceptions.
        try {

            double a = 20;
            double b = 0;
            double div = a / b;
            System.out.println(div);
        }catch ( ArithmeticException e){
            System.out.println( "b<0");
        }
        System.out.println("good");


    }
}

