package com.practice.testing;

import java.util.Arrays;
import java.util.Scanner;

public class SumSortedNums {

    public static String evenSortedSum(String s){

        int sum=0;
        int n[] ;
        String st="";
        n = new int[s.length()];

        try {
            for (int i = 0; i < s.length(); i++) {
                n[i] = Character.getNumericValue(s.charAt(i));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        Arrays.sort(n);
        try {
            for (int i : n) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        if(sum > 15)
            st = "true";
        else
           st = "false";


        return st;
    }

    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        String s = scan.next();

        String str = evenSortedSum(s);

    }
}
