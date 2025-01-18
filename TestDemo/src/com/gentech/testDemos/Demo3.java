package com.gentech.testDemos;
//3
class Demo
{
    int num;
    String name;
    void demoss(int number,String names)
    {
        num=number;
        name=names;
        System.out.println(num);
        System.out.println(name);
    }
    static String TypeArth;
    static String fullname;
    static void addition(int a,int b)
    {
        int res=(a+b);
        System.out.println("Addition result is :"+res);
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Demo.addition(20,3);
        Demo.fullname="Vijaylaxmi";
        Demo.TypeArth="Mathes";


    }
}
