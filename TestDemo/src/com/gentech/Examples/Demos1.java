package com.gentech.Examples;
class calculate
{
    int add(int x, int y)
    {
        return(x+y);
    }
    int sub(int a,int b)
    {
        int res=a-b;
        return res;
    }
    void multiplication(int x,int y)
    {
        int res=(x*y);
        System.out.println("Multiplication result:"+res);
    }

}
public class Demos1 {
    public static void main(String[] args) {
        calculate o=new calculate();
        int s=o.add(1,2);
        int s1=o.sub(10,5);
        o.multiplication(s,s1);
        o.multiplication(o.add(10,10), o.sub(10,5));
    }
}
