package com.gentech.MethodesReturn;

class LongArrays {
    long[] arraydemos(long a[])
    {
        long arr[] = new long[a.length];
        for (int i = 0; i < a.length; i++)
        {
            arr[i] = a[i];
        }
        return arr;
    }
}

public class LongArraysSum {
    public static void main(String[] args) {
        LongArrays o = new LongArrays();
        long s[] = {1l, 2l, 3l, 4l, 5l, 6l};
        long arr[] = o.arraydemos(s);

        System.out.println("Sum of long array is:");
        long sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        System.out.println(sum);
    }
}
