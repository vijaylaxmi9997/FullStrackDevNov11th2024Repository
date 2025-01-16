package com.gentech.Examples;

class Names
{
    int[] getName(int[] s)
    {
        return s;
    }
}

public class SampleExample {
    public static void main(String[] args) {
        Names o = new Names();
        int[] m = {1,3,5,7,9};
        int[] v1 = o.getName(m);

        for (int i = 0; i < v1.length; i++)
        {
            System.out.println(v1[i]+" ");

        }
    }
}

