import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input task code ");
        int code = Integer.parseInt(br.readLine());
        switch(code){
            case 1:
                Task1.fibonacci(br);
                break;
            case 2:
                Decompozition.task2();
                break;
            case 3:
                Task3.task3(br);
                break;
            case 4:
                Task4.task4(br);;
                break;
            case 5:
                Task5.task5();
                break;
            case 6:
                Task6.countWords(br);
                break;
            case 7:
                Task7.task7(br);
                break;
            case 8:
                //Task8;
                break;
            case 9:
                RandomValue.task9();
                break;
            case 10:
                Task10.task10(br);
                break;
            case 12:
                Task12.task12(br);
            case 13:
                Task13.task13();
        }
    }
}


