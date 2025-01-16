package com.gentech.MethodesReturn;
class matrixdemo
{
     int[] Interger(int a[], int b[])
     {
         int res[]=new int[a.length];
         for (int i=0; i< a.length; i++)
         {
             for(int j=0; j<b.length; j++)
             {
                 res[i]=a[i]*b[j];
             }
         }
         return res;
     }
}
public class MatrixAddition {
    public static void main(String[] args) {
        matrixdemo o=new  matrixdemo();
        int m[]={1,2,3};
        int m1[]={2,3,4};
        int res[]=o.Interger(m,m1);
        System.out.println("Addition of numbers:");
        for(int i=0; i<res.length;i++)
        {
            System.out.println(res[i]);
        }


    }
}
