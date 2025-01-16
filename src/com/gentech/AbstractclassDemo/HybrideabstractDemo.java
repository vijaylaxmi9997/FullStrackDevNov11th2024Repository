package com.gentech.AbstractclassDemo;
// 9
abstract class hybrideDemo
{
   abstract void Addition(int x, int y);
   abstract void Substraction(int a, int b);
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
class hybrideDemo1 extends hybrideDemo
{
    void Addition(int x, int y)
    {
        System.out.println("Additon result:"+(x+y));
    }
    void Substraction(int a, int b)
    {
        System.out.println("Substraction result:"+(a-b));
    }
    void Multiplication(int x, int y)
    {
        System.out.println("multiplication result:"+(x*y));
        System.out.println("++++++++++++++++++++++++++++++++++++");
    }
}

public class HybrideabstractDemo {
    public static void main(String[] args) {

        hybrideDemo1 o1=new hybrideDemo1();
        o1.Character(new char[] {'z','x','c','v','b'});
        o1.Addition(20,40);
        o1.Substraction(60,30);
        o1.Multiplication(5,5);

    }
}
