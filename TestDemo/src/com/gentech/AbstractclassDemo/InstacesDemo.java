package com.gentech.AbstractclassDemo;
abstract class InstancesDemo1
{
    void SumDemo()
    {
        int start=1; int end=50;
        int sum=0;
        for(int i=1; i<=50; i++)
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
                System.out.println(""+i);

            }

        }
        System.out.println("sum of prime number is:"+sum);
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }
}
class Sumdemo2 extends InstancesDemo1
{
    void  Dem2()
    {
        int count=0;
        for (int i = 100; i <= 200; i++) {
            if (i % 6 == 0) {
                count++;
            }

        }
        System.out.println("count of number which is divisible by 6:" + count);
    }
}
public class InstacesDemo {
    public static void main(String[] args) {
        Sumdemo2 o=new Sumdemo2();
        o.SumDemo();
        o.Dem2();

    }
}
