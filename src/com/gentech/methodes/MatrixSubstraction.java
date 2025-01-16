package com.gentech.methodes;

class MatrixArray
{
    void Arrays(int a[][], int b[][])
    {
        int res[][] = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                res[i][j] = a[i][j] - b[i][j];
            }
        }
        for (int i = 0; i < res.length; i++)
        {
            for (int j = 0; j < res[i].length; j++)
            {
                System.out.print(res[j][i] + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixSubstraction {
    public static void main(String[] args) {
        MatrixArray o = new MatrixArray();
        int s[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int z[][] = {{0, 1, 2}, {2, 2, 2}, {1, 2, 3}};
        o.Arrays(s, z);
    }
}
