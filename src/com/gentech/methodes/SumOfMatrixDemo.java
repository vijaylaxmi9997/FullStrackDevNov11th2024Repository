package com.gentech.methodes;

class MatrixArrays
{
    void Arrays(int a[][], int b[][])
    {

        int res[][] = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Resultant Matrix after Addition:");
        for (int i = 0; i < res.length; i++)
        {
            for (int j = 0; j < res[i].length; j++)
            {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < res.length; i++) {
            for (int j =0; j < res[i].length; j++) {
                sum = sum + res[i][j];
            }
        }
        System.out.println("Sum of all elements in the resultant matrix: " + sum);
    }
}

public class SumOfMatrixDemo {
    public static void main(String[] args) {
        MatrixArrays o = new MatrixArrays();
        int s[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int z[][] = {{0, 1, 2}, {2, 2, 2}, {1, 2, 3}};
        o.Arrays(s, z);
    }
}
