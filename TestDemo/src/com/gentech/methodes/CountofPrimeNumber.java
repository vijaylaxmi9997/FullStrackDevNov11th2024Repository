package com.gentech.methodes;
class PrimeCountDemo
{
    void CountDemo()
    {
        int a=100; int b=200;
        int count=0;
        for(int i=100; i<=200; i++)
        {
            int check=0;
            for(int j=1; j<=i; j++)
            {
                if(i%j==0)
                {
                    check++;
                }
            }
            if(check==2)
            {
                count=count+1;
                System.out.println("is a prime number:"+i);
            }
        }
        System.out.println("The count of prime number is:"+count);
    }
}
public class CountofPrimeNumber {
    public static void main(String[] args) {
        PrimeCountDemo o=new PrimeCountDemo();
        o.CountDemo();

    }
}
