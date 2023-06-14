package com.practiceproblem10;


import java.util.*;

public class PrintElementInArray {
    public static void main(String[] args) {
        System.out.println("Enter row and columns");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();


        int[][] matrix = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }

    }
}

