package com.gentech.Inheritances;
class Maths1
{
   void Addition(int x, int y)
   {
       System.out.println("Additon result:"+(x+y));
   }
}
class Maths2 extends Maths1
{
    void Substraction(int a, int b)
    {
        System.out.println("Substraction result:"+(a-b));
    }
}
class Maths3 extends Maths2
{
    void Multiplication(int x, int y)
    {
        System.out.println("multiplication result:"+(x*y));
    }
}
public class MultilevelDemo {
    public static void main(String[] args) {
        Maths3 o=new Maths3();
        o.Addition(150,50);
        o.Substraction(9,3);
        o.Multiplication(9,5);
    }
}
