package com.company;

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


