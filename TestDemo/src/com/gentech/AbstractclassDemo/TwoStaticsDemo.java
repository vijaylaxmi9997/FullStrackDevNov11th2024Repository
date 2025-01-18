package com.gentech.AbstractclassDemo;
 abstract class TwoDemos
{
    static void dem9()
    {
        int num=7;
        for(int i=1; i<=10; i++)
        {
            System.out.println(num+"*"+i+"="+num*i);

        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
    static void dem7()
    {
        int k=0;
        for (int i = 500; i >= 200; i--) {
            if (i % 10 == 0) {
                k++;
            }
        }
        System.out.println("total divisible number by 10 is:" + k);

    }
}
public class TwoStaticsDemo {
    public static void main(String[] args) {
        TwoDemos.dem9();
        TwoDemos.dem7();
    }
}
