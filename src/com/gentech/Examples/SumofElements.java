package com.gentech.Examples;
class  Maths2
{
   int  Maths2Demo(int a[])
    {
        int sum=0;
        for(int i=0; i<a.length; i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }
}
public class SumofElements {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        Maths2 o1=new  Maths2();
        int sum=o1.Maths2Demo(a);
        System.out.println(sum);
    }
}
