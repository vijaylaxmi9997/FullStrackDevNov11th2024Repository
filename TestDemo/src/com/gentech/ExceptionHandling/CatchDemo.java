package com.gentech.ExceptionHandling;
class Maths1
{
    static void Division(int x, int y)
    {
        try {
            int res = x / y;
            System.out.println("Division  result:" + res);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class CatchDemo {
    public static void main(String[] args) {
        Maths1.Division(450,0);
    }
}
