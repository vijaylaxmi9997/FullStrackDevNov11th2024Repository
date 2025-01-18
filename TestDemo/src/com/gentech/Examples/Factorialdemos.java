package com.gentech.Examples;
class program1
{

    int getfactorail(int num)
    {
        int fact=1;
        for(int i=num; i>=1; i--)
        {
            fact=fact*i;
        }
        return fact;
    }
}
public class Factorialdemos {
    public static void main(String[] args) {
        program1 ob=new program1();
        int v1=ob.getfactorail(4);
        System.out.println(v1);
    }
}
