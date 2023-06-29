package com.practiceproblem24and25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter mobile number");

        Pattern p = Pattern.compile("[+0-9]{3}\s[0-9]{10}");
        String number = sc.nextLine();
        Matcher m = p.matcher(number);

        if(m.matches()){
            System.out.println("valid number");
        }else{
            System.out.println("enter valid no");
        }
    }
}
