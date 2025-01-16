package com.gentech.practices;
class Demo1
{
    void Array2()
    {
        int sum=0;
        int x[][]={{2,3,4},{1,2,3},{1,2,3}};
        for(int i=0; i<x.length; i++)
        {
            for(int j=0; j<x[0].length;j++)
            {
                sum=sum+x[i][j];
            }
        }
        System.out.println("Sum of arrays: "+sum);

    }
    void tables()
    {
        for(int i=1; i<=10; i++)
        {
            for(int j=1; j<=10; j++)
            {
                System.out.println(i*j+" ");
            }

        }
    }

}
public class TestDemo1 {
    public static void main(String[] args) {
        Demo1 o=new Demo1();
        o.Array2();
        o.tables();
        int sum=0;
        int a[][]={{1,2,3},{2,1,2},{3,2,1}};
        int b[][]={{1,1,1},{2,2,2},{3,2,1}};
        int c[][]=new int[a.length][a[0].length];
        for(int i=0; i<a.length; i++)
        {
            for (int j=0; j<b.length; j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        for(int k=0; k<c.length; k++)
        {
            for(int v=0; v<c[0].length; v++)
            {
                sum=sum+c[k][v];
            }
        }
        System.out.println("sum of addition arrays is:"+sum);
    }
}
