package com.HW4_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Task 1.1
    /*  float n1, n2, n3;
        System.out.println("Vvedite 3 chisla s plavayuschey tochkoy: ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        checkBelong(n1);
        checkBelong(n2);
        checkBelong(n3);
    */
//Task 1.2
    /*    System.out.println("Vvedite 3 celih chisla: ");
        int n1, n2, n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        System.out.println("Naibolshee chislo = " + maxOfThreeIntegers(n1, n2, n3));
        System.out.println("Naaimenshee chislo = " + minOfThreeIntegers(n1, n2, n3));
    */

    //Task 1.3
/*    System.out.println("Vvedite nomer oshibki ot 400 do 403 ");
        int number = sc.nextInt();

        switch (number){
            case 400: HTTPErrors er0 = HTTPErrors.error400; System.out.println(er1.errorType().toString()); break;
            case 401: HTTPErrors er1 = HTTPErrors.error401; System.out.println(er2.errorType().toString()); break;
            case 402: HTTPErrors er2 = HTTPErrors.error402; System.out.println(er3.errorType().toString()); break;
            case 403: HTTPErrors er3 = HTTPErrors.error403; System.out.println(er4.errorType().toString()); break;
            default:
                System.out.println("Wrong error number!");
        }
*/
//Кажется перемудрил с этим свичем, как было бы проще и эффективнее??


    }

    public static void checkBelong(float num) {
        if (num >= -5.0 && num <= 5.0) {
            System.out.println("Chislo " + num + " prinadlezit diapazonu [-5, 5]");
        } else System.out.println("Chislo " + num + " ne prinadlezit diapazonu [-5, 5]");
    }

    public static int maxOfThreeIntegers(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }

    }

    public static int minOfThreeIntegers(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }

}
