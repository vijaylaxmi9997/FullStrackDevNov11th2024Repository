package com.gentech.Statics;

public class Program9 {
    static  int sum=0;
    static void dem10()
    {
        for(int i=1; i<=10; i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of number is:"+sum);
    }
    public static void main(String[] args) {
        Program9.dem10();

    }
}
