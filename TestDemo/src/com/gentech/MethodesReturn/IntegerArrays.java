package com.gentech.MethodesReturn;
class ArraysDemo
{
    int[][] IntegerArrays(int v[][])
    {
        int rows = v.length;
        int cols = v[0].length;
        int arr[][] = new int[cols][rows];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                arr[i][j] = v[i][j];
            }
        }

        return arr;
    }
}

public class IntegerArrays {
    public static void main(String[] args) {
        ArraysDemo o = new ArraysDemo();
        int m[][] = {{1, 2, 3}, {2, 3, 4},{1,2,3}};
        int arr[][] = o.IntegerArrays(m);

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
}
