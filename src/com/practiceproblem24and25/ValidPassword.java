package com.practiceproblem24and25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter password");

        Pattern p = Pattern.compile("[A-Z]{1,8}[!@#$%^&*]{1}[0-9]{1,8}");
        String patt = sc.nextLine();
        Matcher m = p.matcher(patt);

        if(m.matches()){
            System.out.println("valid password");
        }else{
            System.out.println("enter valid password");
        }
    }
}
