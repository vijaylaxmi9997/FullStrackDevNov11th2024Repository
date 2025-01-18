package com.gentech.methodes;
class Tables
{
    void Demo()
    {
        int k=0;
        for(int i=1;i<=20;i++)
        {
            for (int j=1;j<=10;j++)
            {
                k=i*j;
                System.out.println(k);
            }
            System.out.println();
        }
    }
}
public class Tables20Demo {
    public static void main(String[] args) {
        Tables o=new Tables();
        o.Demo();
    }
}
