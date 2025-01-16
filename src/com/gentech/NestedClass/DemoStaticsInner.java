package com.gentech.NestedClass;
class  OuterDemo3
{
    String ArthOper;
    InnerDemo ob=new InnerDemo();
    void showDemo()
    {
        ob.TypeArth= "Arithmetic Operations";
        ob.addition(100,60);
        System.out.println("Type of opertaion:"+ob.TypeArth);
    }
    void multiplicationDemo()
    {
        int a=30;int b=20;
        int res=(a*b);
        System.out.println("Multiplication result is:"+res);


    }
    class InnerDemo
    {
        String TypeArth;
        static void addition(int a,int b)
        {
            int res=(a+b);
            System.out.println("Addition result is :"+res);
        }
        {
            int x=100;
            int y=20;
            int result=(x-y);
            System.out.println("The Difference is :"+result);
        }


    }
}
public class DemoStaticsInner {
    public static void main(String[] args) {
        OuterDemo3 ob=new OuterDemo3();
        ob.showDemo();
        ob.multiplicationDemo();


    }
}