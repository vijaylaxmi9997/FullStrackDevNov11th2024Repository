package com.gentech.Examples;
class Calculation1
{
    void Addition()
    {
        int x,y;
        x=10;y=20;
        int res=(x+y);
        System.out.println("Addition:"+res);
    }
    void  Multiplication()
    {
        int a,b;
        a=20; b=30;
        int res=(a*b);
        System.out.println("Multiplication:"+res);
    }
}
public class CalculationDemo {
    public static void main(String[] args) {
        Calculation1 o=new Calculation1();
        o.Addition();
        o.Multiplication();
    }
}
