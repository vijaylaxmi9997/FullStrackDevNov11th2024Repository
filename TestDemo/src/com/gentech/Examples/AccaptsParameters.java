package com.gentech.Examples;
class Examples
{
    void Addition(int x, int y)
    {
        int res=(x+y);
        System.out.println("Addition:"+res);
    }
    void  Multiplication(int a,int b)
    {
         int res=(a*b);
         System.out.println("Multiplication:"+res);
    }
}
public class AccaptsParameters {
    public static void main(String[] args) {
        Examples o=new Examples();
        o.Addition(100,200);
        o.Multiplication(2,5);
    }
}
