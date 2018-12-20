package com.practice.testing;

import java.util.Scanner;

public class letter {

    public static String lettercheck(String s){

        String st="";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                if (s.charAt(i) == 'a' | s.charAt(i) == 'e' | s.charAt(i) == 'i' | s.charAt(i) == 'o' | s.charAt(i) == 'u') {
                    st = "Vowel";
                } else {
                    st = "Consonant ";
                }
            } else {
                st = "Input not a letter";
                break;
            }
        }

        return st;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String :");
        String s = scan.next();
        String str = lettercheck(s);

    }
}