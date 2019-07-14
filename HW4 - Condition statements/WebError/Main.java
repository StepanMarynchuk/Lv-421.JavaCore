package Cont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter number of WebError");
        int input = Integer.parseInt (br.readLine ());
        switch (input) {
            case 400:
                System.out.println (Error.BadRequest);
                break;
            case 401:
                System.out.println (Error.Unauthorized);
                break;
            case 402:
                System.out.println (Error.PaymentRequired);
                break;
            case 403:
                System.out.println (Error.Forbidden);
                break;
            case 404:
                System.out.println (Error.NotFound);
                break;
            case 502:
                System.out.println (Error.BadGateway);
                break;
            default:
                System.out.println("Check input");
                System.exit(0);



        }
}
    
}