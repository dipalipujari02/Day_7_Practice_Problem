package com.practiceproblem10;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementOddPositin {
    public static void main(String[] args) {
        System.out.println("Enter size of array ");
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter element in array");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString (arr));

        for(int i =0;i<size;i++){
            if(i%2 !=0){
                System.out.println("index is " + i + " element is "+arr[i]);
            }

        }

    }
}
