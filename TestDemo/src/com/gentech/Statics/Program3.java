package com.gentech.Statics;

public class Program3
{
     static int a=20;
     static int b=10;
     static void Dem3()
     {
         for (int i = a; i >= b; i--)
         {
             if (i % 2 == 0)
             {
                 System.out.println(i);
             }
         }
     }
    public static void main(String[] args) {
        Program3.Dem3();

    }

}
