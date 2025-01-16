package com.gentech.Examples;
class ReturnDemoprime
{
    boolean Sumprimenumber(int num)
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
          return true;
      }
      else
      {
          return false;
      }
    }
}
public class Program4 {
    public static void main(String[] args) {
        ReturnDemoprime o=new ReturnDemoprime();
        boolean val=o.Sumprimenumber(7);
        System.out.println(val);
        // sum of prime numbers in b/w 1 to 100
        int sum=0;
        for (int i=1; i<=100; i++)
        {
            if(o.Sumprimenumber(i)==true)
            {
                sum=sum+i;
            }
        }
        System.out.println("sum of prime numbers:"+sum);
        //count of prime numbers in b/w 100 to 200;
        int count=0;
         for(int i=100; i<=200; i++)
         {
             if(o.Sumprimenumber(i)==true)
             {
                 count++;
             }
         }
        System.out.println("count of prime number:"+count);
         // displays prime number in b/w 50 to 150
        for(int i=50; i<=150; i++)
        {
            if(o.Sumprimenumber(i)==true)
            {
                System.out.println("is a prime number:"+i);
            }
        }


    }
}
