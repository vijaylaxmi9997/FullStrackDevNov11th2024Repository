package com.gentech.MethodesReturn;
class Countofsum
{
    int CountNumber()
    {
        int count=0;
        for(int i=100; i<=200; i++)
        {
            if(i%6==0)
            {
                count++;
                System.out.println("is divisible by 6:"+i);
            }

        }
        return  count;
    }
}
public class CountofNumbers {
    public static void main(String[] args) {
        Countofsum o=new Countofsum();
        int v=o.CountNumber();
        System.out.println("count of number which is divisible by 6:"+v);
    }
}
