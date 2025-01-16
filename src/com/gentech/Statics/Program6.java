package com.gentech.Statics;

public class Program6
{
    static int m[] = {2, 2, 3};
    static int m1[] = {3, 3, 4};
    static void dem6()
    {
        int res[] = new int[m.length];

        for (int i = 0; i < m.length; i++)
        {
            res[i] = m[i] + m1[i];
        }
        System.out.println("Addition of corresponding numbers:");
        for (int i = 0; i < res.length; i++)
        {
            System.out.println(res[i]);
        }
    }

    public static void main(String[] args)
    {
        Program6.dem6();
    }
}
