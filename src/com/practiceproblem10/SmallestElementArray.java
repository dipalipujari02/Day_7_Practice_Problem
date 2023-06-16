package com.practiceproblem10;

import java.util.Arrays;

public class SmallestElementArray {
    public static void main(String[] args) {

     int [] arr = {23,87,23,13,67,67,4,5,87,36,1,9};

        System.out.println(Arrays.toString(arr));
        int minimum = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        System.out.println("Minimum number is = "+minimum);




    }
}
