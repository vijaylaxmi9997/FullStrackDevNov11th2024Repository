package com.gentech.Statics;

public class Program2 {
    static int count=0;
    static void  Dem2()
    {
        for (int i = 100; i <= 200; i++) {
            if (i % 6 == 0) {
                count++;
            }

        }
        System.out.println("count of number which is divisible by 6:" + count);
    }
    public static void main(String[] args)
    {
        Program2.Dem2();
    }

    }

