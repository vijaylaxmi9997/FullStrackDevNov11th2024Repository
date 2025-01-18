package com.gentech.Statics;

public class Program7 {
    static int k=0;
    static void dem7()
    {
        for(int i=500; i>=200; i--)
        {
            if(i%10==0)
            {
                k++;
            }
        }
        System.out.println("total divisible number by 10 is:"+k);
    }

    public static void main(String[] args) {
        Program7.dem7();

    }
}
