package com.gentech.Examples;
class FibDemo
{
    void Fib()
    {
        int fn=0; int sn=1;
        System.out.println(fn+" "+sn+" ");
        for(int i=1; i<=8; i++)
        {
            int tn=fn+sn;
            fn=sn;
            sn=tn;
            System.out.print(tn+" ");
        }
    }
}
public class FibonacciDemo {
    public static void main(String[] args) {
        FibDemo o=new FibDemo();
        o.Fib();
    }
}
