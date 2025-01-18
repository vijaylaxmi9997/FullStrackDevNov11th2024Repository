package com.gentech.Examples;
class Methodes
{
    String[] arrays(String[] a)
    {
        return  a;
    }
}
public class SampleExample1 {
    public static void main(String[] args) {
        Methodes o=new Methodes();
        String s[]={"annu","kavya","vijju","sumeet","sushil","sudeep","sonu"};
        String[] v= o.arrays(s);
        for(int i=0; i< v.length; i++)
        {
            System.out.println(v[i]);
        }
    }
}
