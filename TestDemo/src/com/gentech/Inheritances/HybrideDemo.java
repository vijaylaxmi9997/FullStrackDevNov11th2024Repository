package com.gentech.Inheritances;
class MathsDemo
{
    void Addition(int x, int y)
    {
        System.out.println("Additon result:"+(x+y));
    }
}
class MathsDemo2 extends MathsDemo
{
    void Substraction(int a, int b)
    {
        System.out.println("Substraction result:"+(a-b));
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    }
}
class MathsDemo3 extends MathsDemo
{
    void Multiplication(int x, int y)
    {
        System.out.println("multiplication result:"+(x*y));
    }
}
class MathsDemo4 extends MathsDemo3
{
    void Division(int a, int b)
    {
        System.out.println("division result:"+(a/b));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    }
}
public class HybrideDemo {
    public static void main(String[] args) {
        MathsDemo4 o=new MathsDemo4();
        o.Addition(30,80);
        o.Multiplication(8,4);
        o.Division(500, 10);

        MathsDemo2 o1=new MathsDemo2();
        o1.Addition(300,250);
        o1.Substraction(990,500);

    }
}
