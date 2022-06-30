package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int [][] sum = new int[matrix1.length][matrix2[0].length];
        for (int i=0; i<sum.length; i++) {
            for (int j=0; j<sum[0].length; j++) {
                for (int k=0; k<matrix2.length; k++) {
                    sum[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
//                {0, 12345},
//                {4509, 0},
//                {3, 567} };
                {1, 2, 3},
                {4, 5, 6}};
        int[][] b = {
//                {653, 0, 25353},
//                {0, 61, 6} };
                {7 , 8 },
                {9 , 10},
                {11, 12}};
        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
