package com.gentech.MethodesReturn;
class EvenDemo
{
    int Programs()
    {
        int num=0;
        for(int i=20; i>=10; i--)
        {
            if(i%2==0)
            {
                System.out.println("Even numbers:"+i);
                num++;
            }
        }
        return num;
    }
}
public class EvenNumbers {
    public static void main(String[] args) {
        EvenDemo o=new EvenDemo();
        int a=o.Programs();
        System.out.println("total Even number between 40 to 20 is:"+a);
    }
}
