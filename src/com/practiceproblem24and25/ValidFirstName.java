package com.practiceproblem24and25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidFirstName {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter First name");
        Pattern p = Pattern.compile("[A-Z]{1}[a-z]{1,}");

        String name = sc.nextLine();
        Matcher m = p.matcher(name);

        if(m.matches()){
            System.out.println("Valid pattern");
        }else{
            System.out.println("invalid patter of First name");
        }
    }
}
