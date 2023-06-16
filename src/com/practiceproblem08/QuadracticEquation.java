package com.practiceproblem08;

import java.util.Scanner;

public class QuadracticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value Of a ");
        double a = sc.nextDouble();

        System.out.println("Enter Value of b ");
        double b = sc.nextDouble();

        System.out.println("Enter value of c ");
        double c = sc.nextDouble();

        double delta = b*b - 4 *a * c;
        System.out.println(delta);

        if(delta>0.0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Root one is = " + root1);
            System.out.println("Root second is = "+root2);
        }else{
            System.out.println("enter valid no");
        }
    }
}
