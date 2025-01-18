package com.gentech.practices;
class Aaa
{
    void superclass(int a, int b)
    {
        System.out.println("addition:"+(a+b));
    }
}
class Bbb extends Aaa
{
    void subclass(int x, int y)
    {
        System.out.println("multiplication:"+(x*y));
    }
}
class Ccc extends Aaa
{
    void subtaction(int a, int b)
    {
        System.out.println("sub :"+(a-b));
    }
}
class Dd extends Ccc
{
    void Division(int x,int y)
    {
        System.out.println("division:"+(x/y));
    }
}
public class HybrideDemo {
    public static void main(String[] args) {
        Dd o=new Dd();
        o.superclass(10,30);
        o.Division(25,5);
        o.subtaction(160,30);

        Bbb o1=new Bbb();
        o1.subclass(8,9);
        o1.superclass(50,50);

    }
}
