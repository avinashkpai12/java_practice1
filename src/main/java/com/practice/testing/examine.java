package com.practice.testing;

import java.util.Scanner;

public class examine {
    public static String examinestr(String s){

        String str = "";

        if(Character.isUpperCase(s.charAt(0))){
            str = "Capital Letter";

        }

        else if(Character.isLowerCase(s.charAt(0))){
            str = "Small Letter";
        }

        else if(Character.isDigit(s.charAt(0))){
            str = "Digit";
        }
        else{
            str = "Special Character";
        }

        return str;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Character");
        String s = scan.next();

        examinestr(s);

    }
}
