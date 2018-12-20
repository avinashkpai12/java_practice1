package com.practice.testing;

import java.util.Scanner;

public class StringReverse {
    public static String reverse(String s){

        char temp;
        char[] chararr = s.toCharArray();

        for(int i=0;i<s.length()/2;i++){
            temp = chararr[i];
            chararr[i] = chararr[s.length()-i-1];
            chararr[s.length()-i-1] = temp;
        }

        String ns = new String(chararr);

        return ns;


    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = scan.next();
        String str = reverse(s);

    }

}
