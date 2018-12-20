package com.practice.testing;

import java.util.Scanner;

public class IntegerCheckRange {

    public static String check(int n){
        String str = "";

        if((n%2==0)&&(n>20&&n<30 )){
            str = "Jerry";

        }

        else if((n%2==1)&&(n>20&&n<30)){
            str = "Tom";
        }
        return str;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        String s = check(n);


    }
}
