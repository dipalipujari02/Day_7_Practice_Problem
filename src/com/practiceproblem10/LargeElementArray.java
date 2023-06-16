package com.practiceproblem10;

import java.util.Arrays;

public class LargeElementArray {
    public static void main(String[] args) {
        int[] arr = {20,23,98,64,6,8,};
        System.out.println(Arrays.toString(arr));
        int maximum = arr[0];


        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        System.out.println("Maximum Element is = "+maximum);

    }
}
