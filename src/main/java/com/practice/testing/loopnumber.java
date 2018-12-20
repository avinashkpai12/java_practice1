package com.practice.testing;

import java.util.Scanner;

public class loopnumber {

    public static String loop(int n){
        String s = "";

        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
               s = s + Integer.toString(i);
            }
        }

        return s;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");

        int n = scan.nextInt();

       String str =  loop(n);
       System.out.println(str);
    }
}
