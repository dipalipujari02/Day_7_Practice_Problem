package com.practiceproblem11;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {

        int sum =0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no you have to cheack perfect or not");
        int n = sc.nextInt();

        for (int i = 1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum == n){
            System.out.println("It is perfect no = "+n);
        }else {
            System.out.println("It is not perfect no = "+n);
        }

    }
}
