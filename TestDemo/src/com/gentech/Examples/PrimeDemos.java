package com.gentech.Examples;
class Program3
{
    void isPrime()
    {
        for(int i=50; i<=100; i++)
        {
            int look=0;
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    look=look+1;
                    break;
                }
            }
            if(look==0)
            {
                System.out.println("is a prime number:"+i);
            }
        }
    }
    void SumisPrime()
    {
        int sum=0;
        for(int i=50; i<=100; i++)
        {
            int look=0;
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    look=look+1;
                    break;
                }
            }
            if(look==0)
            {
               sum=sum+i;
            }
        }
        System.out.println("sum of  prime number:"+sum);
    }
    void CountOfprime()
    {
        int count =0;
        for(int i=50; i<=100; i++)
        {
            int look=0;
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    look=look+1;
                    break;
                }
            }
            if(look==0)
            {
                count++;
            }
        }
        System.out.println("count of  prime number:"+ count);
    }
}
public class PrimeDemos {
    public static void main(String[] args) {
        Program3 o=new Program3();
        o.isPrime();
        o.SumisPrime();
        o.CountOfprime();
    }
}
