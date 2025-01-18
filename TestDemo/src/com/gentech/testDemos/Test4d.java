package com.gentech.testDemos;
//8
class Dem3
{
    int num;
    String name;
    void Demos(int nums, String names)
    {
        num=nums;
        name=names;
        System.out.println(num);
        System.out.println(name);
    }
    void mult()
    {
        int a=10;int b=20;
        int res=(a*b);
        System.out.println("Multiplication result is:"+res);

    }
}

public class Test4d {
    public static void main(String[] args) {
        Dem98 o=new Dem98();

        o.Demos(21,"vijju");

    }
}
