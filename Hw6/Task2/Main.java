package com.softserve;

public class Main {

        public static void main(String[] args) {
            Employee [] em = new Employee[2];

            em [0] = new SalariedEmployee ("TS133", 140, 10, 198 );
            em [1] = new ContractEmployee ("SS177", 168, 3900 );

            for (int i = 0; i < em.length; i++) {
                System.out.println (em[i]);
                System.out.println ("Average monthly wage is:" + ' ' + em[i].calculatePay ());
            }
        }
    }