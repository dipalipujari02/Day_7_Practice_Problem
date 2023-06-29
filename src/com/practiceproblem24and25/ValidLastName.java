package com.practiceproblem24and25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidLastName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter last name = ");

        Pattern p = Pattern.compile("[A-Z]{1}[a-z]{1,}");
        String last = sc.nextLine();
        Matcher m = p.matcher(last);

        if(m.matches()){
            System.out.println("valid pattern");
        }else{
            System.out.println("enter valid pattern of last name ");
        }
    }
}
