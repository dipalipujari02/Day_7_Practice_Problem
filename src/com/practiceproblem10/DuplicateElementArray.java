package com.practiceproblem10;

import java.util.Arrays;

public class DuplicateElementArray {
    public static void main(String[] args) {
        int[] arr ={45,87,23,54,67,45,87,23,23,67,90,76,90,87};
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);

                }
            }
        }
    }
}
