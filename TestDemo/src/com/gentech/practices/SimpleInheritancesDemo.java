package com.gentech.practices;
class A
{
    void superclass(int a, int b)
    {
        System.out.println("addition:"+(a+b));
    }
}
class B extends A
{
    void subclass(int x, int y)
    {
        System.out.println("multiplication:"+(x*y));
    }
}
public class SimpleInheritancesDemo {
    public static void main(String[] args) {
        B obj=new B();
        obj.subclass(10,20);
        obj.superclass(100,200);
    }
}
