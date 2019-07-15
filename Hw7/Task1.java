package com.softserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


    public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a 5-word sentence");
        String s = br.readLine();

        StringBuilder reverseWord = null;
        String[] word = s.split (" ");
        String maxlethWord = "";

        for (int i = 0; i < word.length; i++) {
            if (word[i].length () >= maxlethWord.length ()) {
                maxlethWord = word[i];
            }
        }
        reverseWord = new StringBuilder(word[1]);
        reverseWord.reverse();

            System.out.println ("The longest word is" + ' ' + maxlethWord);
            System.out.println ("Total number of letters is" + ' ' + s.length ());
            System.out.println("Reverse word is:" + ' ' + reverseWord);

        }
    } 
