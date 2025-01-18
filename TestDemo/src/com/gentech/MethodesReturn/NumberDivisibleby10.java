package com.gentech.MethodesReturn;
class Numbers
{
    int numberDemo()
    {
        int k=0;
        for(int i=500; i>=200; i--)
        {
            if(i%10==0)
            {
                k++;
                System.out.println("is divisible by 10:"+i);
            }
        }
        return k;
    }
}
public class NumberDivisibleby10 {
    public static void main(String[] args) {
        Numbers o=new Numbers();
        int v=o.numberDemo();
        System.out.println("numbers between 200 to 500:"+v);

    }
}
