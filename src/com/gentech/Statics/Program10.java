package com.gentech.Statics;

public class Program10 {
    static  int count=0;
    static void Demm1()
    {
        for(int i=1; i<=500; i++)
        {
            if(i%2==1)
            {
                count++;
            }
        }
        System.out.println("odd number b/w 1 to 500 is:"+count);
    }
    public static void main(String[] args) {
        Program10.Demm1();

    }
}
