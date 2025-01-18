package com.gentech.methodes;
class Primenumbers
{
   void  PrimeDemo()
   {
       int start=1; int end=100;
       int sum=0;
       for(int i=1; i<=100; i++)
       {
           int look=0;

           for(int j=1; j<=i;j++)
           {
               if(i%j==0)
               {
                   look++;
               }
           }
           if(look==2)
           {
               sum=sum+i;
               System.out.println("prime Numbers:"+i);

           }

       }
       System.out.println("sum of prime number is:"+sum);
   }

}
public class SumofPrimeNumber {
    public static void main(String[] args) {
        Primenumbers o=new Primenumbers();
        o.PrimeDemo();

    }
}
