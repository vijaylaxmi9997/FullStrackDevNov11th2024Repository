package com;
class Demos1
{
    int values(int num)
    {
        int fact=1;
        for(int i=num; i>=1; i--)
        {
            fact=fact*i;
        }
        return fact;
    }
    int sumofnumber(int num)
    {
        int sum=0;
        for(int i=0; i<=num; i++)
        {
            sum=sum+i;
        }
        return  sum;
    }
    String getname(String name)
    {
        return name;
    }
    int [] demo(int a[])
    {
        return a;
    }
}
public class Program1 {
    public static void main(String[] args) {
        Demos1 o=new Demos1();
        int v1=o.values(5);
        System.out.println(v1);
        int v2=o.sumofnumber(10);
        System.out.println(v2);
        String v3=o.getname("Ammu") ;
        System.out.println(v3);

        o.demo(new int[] {1,2,3,4,5});

    }
}
