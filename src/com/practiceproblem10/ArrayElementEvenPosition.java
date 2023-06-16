package com.practiceproblem10;

public class ArrayElementEvenPosition {
    public static void main(String[] args) {
        int[] arr ={23,54,65,23,56,43,98,75,45};


        for(int i=0;i<arr.length;i++) {
            if (i % 2 == 0) {
                System.out.println("index is "+i + " element is " +arr[i]);
            }
        }
    }
}
