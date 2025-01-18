package com.gentech.practices;
class Aax
{
    Aax()
    {
        System.out.println("addition:");
    }
}
class Bbx extends Aax
{
    Bbx()
    {
        super();
        System.out.println("multiplication:");
    }
}
class Ccx extends Bbx
{
    Ccx()
    {
        super();
        System.out.println("subtraction :");
    }
}
public class MultilevelNoAgrsdemo {
    public static void main(String[] args) {
        Ccx o=new Ccx();
    }
}
