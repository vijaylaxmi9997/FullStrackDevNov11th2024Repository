package com.gentech.Examples;
class calculate1
{
    int add(int x, int y)
    {
        return (x+y);
    }
    int sub(int a,int b)
    {
        int res=(a-b);
        return res;
    }
    void multiplication()
    {
        int x=add(10,20);
        int y=sub(20,10);
        int res=(x*y);
        System.out.println("multiplication result:"+res);
    }
}
public class Demos2 {
    public static void main(String[] args) {
        calculate1 o=new calculate1();
        o.multiplication();
    }
}
