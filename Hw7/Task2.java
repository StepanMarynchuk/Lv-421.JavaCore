package com.softserve;

public class Task2 {
    public static void main(String[] args) {

        String s = "Let it       be, let   it be, let   it be, let    it be.\n" +
                "Whisper   words   of wisdom,   let    it   be.";

        while (s.contains ("  ")) {
            String replace = s.replace ("  ", " ");
            s = replace;

        }
        System.out.println (s);
    }
    }
