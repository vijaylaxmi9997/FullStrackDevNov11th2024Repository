package com.gentech.ExceptionHandling;
class Maths4
{
    static void Division(int x, int y)
    {
        try {
            int res = x / y;
            System.out.println("Division  result:" + res);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
public class PrintEHDemo {
    public static void main(String[] args) {
        Maths4.Division(9,0);
    }
}
