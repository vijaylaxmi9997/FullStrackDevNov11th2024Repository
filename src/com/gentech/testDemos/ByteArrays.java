package com.gentech.testDemos;
//4
class ByteArray
{
    static byte[][] arraydemo(byte a[][])
    {
        byte arr[][] = new byte[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                arr[i][j] = a[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return arr;
    }
}
public class ByteArrays {
    public static void main(String[] args) {
        ByteArray.arraydemo(new byte[][]{{1,2,3,},{2,4,3}});
    }
}
