package com.gentech.Examples;

class MultiDemo
{
    void Demoss(int a[][], int b[][])
    {
        int res[][] = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < b[0].length; j++)
            {
                res[i][j] = 0;
                for (int k = 0; k < a[0].length; k++)
                {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int l = 0; l < res.length; l++)
        {
            for (int m = 0; m < res[l].length; m++)
            {
                System.out.print(res[l][m] + " ");
            }
            System.out.println();
        }
    }
}

public class MultiplicationDemo {
    public static void main(String[] args) {
        MultiDemo o = new MultiDemo();
        // Example matrices
        int s[][] = {{1, 2, 3}, {3, 2, 1}};
        int v[][] = {{1, 1}, {1,4},{3,3}};

        o.Demoss(s, v);
    }
}
