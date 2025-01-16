package com.gentech.ExceptionHandling;
class Maths
{
    static void Division(int x, int y)
    {
        try {
            int res = x / y;
            System.out.println("Division  result:" + res);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
public class ThrowsDemo {
    public static void main(String[] args) {
        Maths.Division(2,0);
    }
}
