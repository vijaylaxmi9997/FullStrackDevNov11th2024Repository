package com.gentech.testDemos;
//9
class Amb
{
    void  Arrayse(int a, int b)
    {
        System.out.println(+(a*b));
    }
    static void dem10()
    {
        int sum=0;
        for(int i=1; i<=10; i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of number is:"+sum);
    }
}
class Dem
{
    Dem()
    {
        Amb o=new Amb();
        o.Arrayse(20,39);
        Amb.dem10();
    }
}
public class Sanod {
    public static void main(String[] args) {

        Dem o=new Dem();
    }
}
