package com.gentech.Statics;

public class Program5 {
    static long s[] = {1l, 2l, 3l, 4l, 5l, 6l};
    static long arr[] =new long[s.length];
    static void Dem4()
    {
        for (int i = 0; i < s.length; i++)
        {
            arr[i] = s[i];
        }
        System.out.println("Sum of long array is:");
        long sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        System.out.println("sum of number is:"+sum);
    }
    public static void main(String[] args) {
        Program5.Dem4();

    }
}
