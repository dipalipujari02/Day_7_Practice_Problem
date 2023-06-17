package com.practiceproblem11;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int n3;
        int print = 10;

        for(int i =2;i<=print;i++){
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

}
