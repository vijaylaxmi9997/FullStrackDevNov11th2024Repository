package com.gentech.methodes;
class PrimeDemo
{
    void PrimeNumber()
    {
        int start=50; int end=100;
        for(int i=50; i<=100; i++)
        {
            int check=0;
            for(int j=1; j<=i;j++)
            {
                if(i%j==0)
                {
                    check++;
                }
            }
            if(check==2)
            {
                System.out.println("prime Numbers:"+i);
            }
        }

    }
}
public class PrimeNumberDemo {
    public static void main(String[] args) {
        PrimeDemo o=new PrimeDemo();
        o.PrimeNumber();
    }
}
