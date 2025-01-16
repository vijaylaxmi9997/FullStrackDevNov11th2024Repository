package com.gentech.MethodesReturn;

class ByteArray
{
    byte[][] arraydemo(byte a[][])
    {
        byte arr[][] = new byte[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                arr[i][j] = a[i][j];
            }
        }
        return arr;
    }
}

public class Byte2DArray {
    public static void main(String[] args) {
        ByteArray o = new ByteArray();
        byte s[][] = {{1, 2, 3}, {3, 2, 1}, {2, 3, 2}};
        byte arr[][] = o.arraydemo(s);
        System.out.println("Byte arrays are first row");
        System.out.println("Byte array first row:");
        for (int j = 0; j < arr[0].length; j++)
        {
            System.out.print(arr[0][j] + " ");
        }
    }
}
