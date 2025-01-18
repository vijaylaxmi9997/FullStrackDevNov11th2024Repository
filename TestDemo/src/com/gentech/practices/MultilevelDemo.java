package com.gentech.practices;
class Aa
{
    void superclass(int a, int b)
    {
        System.out.println("addition:"+(a+b));
    }
}
class Bb extends Aa
{
    void subclass(int x, int y)
    {
        System.out.println("multiplication:"+(x*y));
    }
}
class Cc extends Bb
{
    void subtaction(int a, int b)
    {
        System.out.println("sub :"+(a-b));
    }
}
public class MultilevelDemo {
    public static void main(String[] args) {
        Cc o=new Cc();
        o.subtaction(400,200);
        o.subclass(5,9);
        o.superclass(400,200);
    }
}
