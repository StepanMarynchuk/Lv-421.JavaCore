package com.softserve.academy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tasks {

  public static void main(String[] args) throws NumberFormatException, IOException {
    // TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //Task1
    System.out.println("Enter radius");
    int radius = Integer.parseInt(br.readLine());
    double perimetr = 2*Math.PI*radius;
    double area =  Math.PI*Math.pow(radius, 2);
    System.out.println("Perimetr = " + perimetr + " Area = " + area);

    //Task2
    String name;
    String address;
    System.out.println("What`s your name ?");
    name = br.readLine();
    System.out.println("Where are you live, "+name+"?");
    address = br.readLine();
    System.out.println("Your name, "+name+" your address "+address);
    
    //Task3
    int c1 = 1;
    int c2 = 2;
    int c3 = 3;
    System.out.println("enter call`s times");
    int t1 = Integer.parseInt(br.readLine());
    int t2 = Integer.parseInt(br.readLine());
    int t3 = Integer.parseInt(br.readLine());
    int price1 = callprice(c1,t1);
    int price2 = callprice(c2,t2);
    int price3 = callprice(c3,t3);
    int sum = price1+price2+price3;
    System.out.println("For call_1 = "+price1+", call_2 = "+price2+", call_3 = "+price3+", Total = "+sum);
    
  }

  private static int callprice(int c, int t) {
    int price = c*t;
    return price;
  }

}