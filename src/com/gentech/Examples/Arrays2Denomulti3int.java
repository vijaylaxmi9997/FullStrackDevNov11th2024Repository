package com.gentech.Examples;

class MatrixArrays1 {
    void Arrays(int a[][], int b[][], int c[][]) {
        if (a[0].length != b.length || b[0].length != c.length) {
            System.out.println("Matrix multiplication is not possible due to dimension mismatch.");

        }
        else
        {
            System.out.println("Matrix multiplication is possible.");
        }
        int rest[][] = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < b[0].length; j++)
            {
                rest[i][j] = 0;
                for (int k = 0; k < a[0].length; k++) {
                    rest[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        int res[][] = new int[rest.length][c[0].length];
        for (int i = 0; i < rest.length; i++)
        {
            for (int j = 0; j < c[0].length; j++)
            {
                res[i][j] = 0;
                for (int k = 0; k < rest[0].length; k++)
                {
                    res[i][j] += rest[i][k] * c[k][j];
                }
            }
        }

        // Print the final result directly
        System.out.println("Final Result after multiplication:");
        for (int i = 0; i < res.length; i++)
        {
            for (int j = 0; j < res[i].length; j++)
            {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Arrays2Denomulti3int {
    public static void main(String[] args) {
        MatrixArrays1 o = new MatrixArrays1();
        int a[][] = {{4, 5}, {7, 8}, {1, 2}};
        int b[][] = {{2, 2}, {1, 3}};
        int c[][] = {{1, 1}, {2, 2}};
        o.Arrays(a, b, c);
    }
}

