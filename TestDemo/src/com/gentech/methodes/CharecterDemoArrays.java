package com.gentech.methodes;
class CharDemo
{
    void Character(char c[])
    {
        char a[]=new char[c.length];
        for (int i=0; i<c.length; i++)
        {
            a[i]=c[i];
        }
        for (int j=a.length-1; j>=a.length/2; j--)
        {
            System.out.println(a[j]);
        }
    }
}
public class CharecterDemoArrays {
    public static void main(String[] args) {
        CharDemo o=new CharDemo();
        char s[]={'a','s','d','f','g','h','j','k','l'};
        o.Character(s);
    }
}
