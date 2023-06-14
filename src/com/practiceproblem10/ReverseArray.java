package com.practiceproblem10;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array ={1,6,7,2,4,8,9,12,10,5};
        System.out.println("Original Array : " +Arrays.toString(array));


        for(int i =array.length-1;i>=0;i--)

           System.out.println(array[i]);



    }
}
