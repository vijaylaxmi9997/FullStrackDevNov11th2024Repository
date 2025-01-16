package com.gentech.MethodesReturn;
class Isnumber
{
    int numberofsum()
    {
        int sum=0;
        for(int i=1; i<=50; i++)
        {
            sum=sum+i;
        }
        return sum;
    }
}
public class Sumofnumbers {
    public static void main(String[] args) {
        Isnumber o=new Isnumber();
        int s=o.numberofsum();
        System.out.println("sum of number between :"+s);

    }
}
