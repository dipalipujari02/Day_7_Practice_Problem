package com.practiceproblem11;

public class PrimeNo {
    public static void main(String[] args) {
        int a ;
        int b ;
        int count=0;
        System.out.println("prime numbers are ");
        for(a = 1; a<=50; a++) {
            int prime =0;
            for(b = 1; b<=a; b++){
                if (a%b == 0){
                    prime++;
                }
            }
            if (prime == 2) {
                System.out.println(a);
                count =count+1;
            }
        }
        System.out.println("count of prime Number is = "+count);
    }
}
