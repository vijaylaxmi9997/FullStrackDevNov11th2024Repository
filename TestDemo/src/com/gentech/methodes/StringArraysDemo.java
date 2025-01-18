package com.gentech.methodes;
class StringDemos
{
    void Strings(String s[])
    {
        String v[]=new String[s.length];
        for(int i=0; i<s.length; i++)
        {
            v[i]=s[i];

        }
        for (int j=v.length-1; j>=v.length/2; j--)
        {
            System.out.println("Anther Arrays:"+v[j]);
        }
    }
}

public class StringArraysDemo {
    public static void main(String[] args) {
        StringDemos o=new StringDemos();
        String a[]={"viiju","sonu","chinnu","Sweety","Ammu","laxmi"};
        o.Strings(a);
    }
}
