package com.practice.testing;

import java.util.Scanner;

public class SumNumber {

    public static int addNum(String s){
        String[] arr = s.split(" ");

        int sum = 0;
        for (String str : arr) {
            sum = sum + Integer.parseInt(str);
        }

        return sum;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number with spaces between them");

        String s = scan.nextLine();

        int n = addNum(s);

    }
}
