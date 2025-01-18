package com.gentech.methodes;
//multiplication of two 1D arrays
class ArrayDemo
{
    void array(int x[], int y[])
    {
        int res[]=new int[x.length+ y.length];
        for(int i=0; i< x.length; i++)
        {
                res[i]=x[i]*y[i];
                System.out.print(res[i]+"  ");

        }
        System.out.println();
        int sum=0;
        for(int j=0; j<=x.length; j++)
        {
            sum=sum+res[j];
        }
        System.out.println("sum of second half:"+sum);


    }
}

public class MultiplicationArray {
    public static void main(String[] args) {
        ArrayDemo o=new ArrayDemo();
        int s[]={1,2,3};
        int a[]={2,3,2};
        o.array(s,a);
    }
}
