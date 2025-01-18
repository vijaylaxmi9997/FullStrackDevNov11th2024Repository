package com.gentech.Statics;

public class Program4 {
    static int m[][] = {{1, 2, 3}, {2, 3, 4},{1,2,3}};
    static int arr[][] = new int[m.length][m[0].length];
    static void dem4()
    {
        int rows = m.length;
        int cols = m[0].length;
        int arr[][] = new int[cols][rows];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                arr[j][i] = m[i][j];
            }
        }

        System.out.println(" array of number:");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Program4.dem4();
    }
}
