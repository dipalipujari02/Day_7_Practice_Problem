package com.practicejava;

import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year you have to cheek leep Year or not");
        int year = sc.nextInt();

        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("Leep year"+year);
        }else{
            System.out.println("Not Leep year"+year);
        }
    }
}
