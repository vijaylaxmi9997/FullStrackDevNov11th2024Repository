package com.gentech.AbstractclassDemo;
abstract class StaticsDemo
{
    static int count=0;
    static void  Dem2()
    {
        for (int i = 100; i <= 200; i++) {
            if (i % 6 == 0) {
                count++;
            }

        }
        System.out.println("count of number which is divisible by 6 :" + count);
    }
}

public class Staticsabstract {
    public static void main(String[] args) {
        StaticsDemo.Dem2();


    }
}
