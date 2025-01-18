package com.gentech.Examples;
class Prime
{
    void isPrime(int num)
    {
        int look=0;
        for(int i=2; i<num; i++)
        {
            if(num%i==0)
            {
                look=look+1;
                break;
            }

        }
        if(look==0)
        {
            System.out.println(num+"is a prime Number");
        }
        else
        {
            System.out.println(num+"is not a prime number");
        }
    }
}
public class ProgramDemo {
    public static void main(String[] args) {
        Prime o=new Prime();
        o.isPrime(11);
        o.isPrime(8);
    }
}
