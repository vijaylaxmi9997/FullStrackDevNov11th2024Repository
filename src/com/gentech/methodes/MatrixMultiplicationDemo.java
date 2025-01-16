package com.gentech.methodes;

class MatrixArrays1 {
    void Arrays(int a[][], int b[][],int c[][])
    {
        if (a[0].length != b.length )
        {
            System.out.println("Matrix multiplication is not possible due to dimension mismatch.");
            return;
        }
        else
        {
            System.out.println("Matrix multiplication is possible due to dimension mismatch.");
        }
        int res[][] = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int m = 0; m < c.length; m++) {
                    for (int k = 0; k < a[0].length; k++)
                    {
                        res[i][j] += a[i][k] * b[k][j] * b[k][m];
                    }

                }
                System.out.print(" " + res[i][j]);
            }
            System.out.println();
        }
        System.out.println("Second half of the resultant Matrix after Multiplication:");
        int startRow = res.length / 2;
        int startCol = res[0].length / 2;
        for (int i = startRow; i < res.length; i++) {
            for (int j = startCol; j < res[i].length; j++){

                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixMultiplicationDemo {
    public static void main(String[] args) {
        MatrixArrays1 o = new MatrixArrays1();
        int s[][] = {{4, 5, 6}, {7, 8, 9},{1,2,3}};
        int z[][] = {{2, 2,1}, {1,3,2}, {3,2,4}};
        int v[][]={{1,2,3},{1,2,3},{1,2,1}};
        o.Arrays(s, z,v);
    }
}
