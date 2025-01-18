package com.gentech.NestedClass;

class  OuterDemo2
{
    String ArthOper;
    void show()
    {
        InnerDemo.TypeArth = "Arithmetic Operations";
        System.out.println("Type of opertaion:"+InnerDemo.TypeArth);
        InnerDemo.addition(15,300);
        InnerDemo.sub(100,20);
    }
    void mult()
    {
        int a=10;int b=20;
        int res=(a*b);
        System.out.println("Multiplication result is:"+res);

    }
    static class InnerDemo
    {
        static String TypeArth;
        static void addition(int a,int b)
        {
            int res=(a+b);
            System.out.println("Addition result is :"+res);
        }
        static void sub(int x,int y)
        {
            int result=(x-y);
            System.out.println("The Difference is :"+result);
        }


    }
}
public class StaticesDemo {
    public static void main(String[] args) {
        OuterDemo2 ob=new OuterDemo2();
        ob.show();
        ob.mult();
    }
}