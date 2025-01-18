package com.gentech.practices;

public class Test4 {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        int fn=0;int  sn=1;
        System.out.println(fn+" "+sn+" ");
        for(int i=1; i<=10; i++)
        {
           int tn=fn+sn;
           fn=sn;
           sn=tn;
           System.out.println(tn+" ");
           sum=sum+tn;
           count++;

        }
        System.out.println("count of number is:"+count);
        System.out.println("sum of fibonaci number is:"+sum);


    }
}
