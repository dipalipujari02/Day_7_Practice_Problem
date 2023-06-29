package com.practiceproblem24and25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your email =");

        Pattern p = Pattern.compile("[a-b0-9]{1,}[@][a-z]{1,}[.][a-z]{2,3}");
        String mail = sc.nextLine();
        Matcher m = p.matcher(mail);

        if(m.matches()){
            System.out.println("valid emali");
        }else{
            System.out.println("enter valid email pattern");
        }
    }
}
