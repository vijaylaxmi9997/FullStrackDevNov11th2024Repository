package com.gentech.MethodesReturn;
class Tables
{
    int Tablesdemo()
    {
        int num=7;
        for(int i=1; i<=10; i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }
        return  num;
    }
}
public class Resultof7tables {
    public static void main(String[] args) {
        Tables o=new Tables();
        int s=o.Tablesdemo();
        System.out.println("this is the tables of:"+s);
    }
}
