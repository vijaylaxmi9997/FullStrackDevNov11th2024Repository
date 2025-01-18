package com.gentech.Examples;
class arraysDemo
{
    int[] Arrays(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
        return a;
    }
}
public class MethodesReturnValues {
    public static void main(String[] args) {
        arraysDemo o=new arraysDemo();
        int[] s=o.Arrays(new int[]  {1,2,3,4,5,6,7,8,9,10});

    }
}
