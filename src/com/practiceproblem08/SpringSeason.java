package com.practiceproblem08;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month");
        int month = sc.nextInt();
        System.out.println("enter day");
        int day = sc.nextInt();

        if((month==3 &&  day >=20  && day<=31) || (month==4 && day>=1 && day<=30)  || (month==5 && day>=1  &&  day<=31) || (month==6  &&  day>=1 &&  day<=20));
        System.out.println("This is spring season =");
        System.out.println("month is = "+month + " day is = "+day);
    }
}
